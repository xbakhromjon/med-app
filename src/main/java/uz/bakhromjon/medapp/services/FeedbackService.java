package uz.bakhromjon.medapp.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.feedback.FeedbackCreateDTO;
import uz.bakhromjon.medapp.dtos.feedback.FeedbackGetDTO;
import uz.bakhromjon.medapp.dtos.feedback.FeedbackUpdateDTO;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicGetDTO;
import uz.bakhromjon.medapp.dtos.recommendationCause.RecommendationCauseGetDTO;
import uz.bakhromjon.medapp.entities.*;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.FeedbackMapper;
import uz.bakhromjon.medapp.repositories.FeedbackRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.FeedbackValidator;

import java.util.List;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@Slf4j
public class FeedbackService extends AbstractService<FeedbackRepository,
        FeedbackMapper, FeedbackValidator> {

    @Autowired
    private HearAboutClinicService hearAboutClinicService;
    @Autowired
    private RecommendationCauseService recommendationCauseService;

    public FeedbackService(FeedbackRepository repository, FeedbackMapper mapper, FeedbackValidator validator) {
        super(repository, mapper, validator);
    }

    // todo xato bor
    public ResponseEntity<FeedbackGetDTO> create(FeedbackCreateDTO createDTO) {
        validator.validForCreate(createDTO);
        Feedback feedback = mapper.toEntity(createDTO);
        List<RecommendationCause> recommendationCauses = recommendationCauseService.getAll(createDTO.getRecommendationCausesId());
        List<HearAboutClinic> hearAboutClinics = hearAboutClinicService.getAll(createDTO.getHearAboutOurClinicsId());
        feedback.setRecommendationCauses(recommendationCauses);
        feedback.setHearAboutOurClinic(hearAboutClinics);
        Feedback saved = repository.save(feedback);
        log.info("Feedback succesfully create {} with id", saved.getId());
        return ResponseEntity.ok(toGetDTO(saved));
    }

    public ResponseEntity<FeedbackGetDTO> get(Long id) {
        Feedback feedback = getPersist(id);
        log.info("Get feedback {} with id", id);
        return ResponseEntity.ok(toGetDTO(feedback));
    }

    public ResponseEntity<FeedbackGetDTO> update(FeedbackUpdateDTO updateDTO) {
        validator.validForUpdate(updateDTO);
        Feedback feedback = mapper.toEntity(updateDTO);
        List<RecommendationCause> recommendationCauses = recommendationCauseService.getAll(updateDTO.getRecommendationCausesId());
        List<HearAboutClinic> hearAboutClinics = hearAboutClinicService.getAll(updateDTO.getHearAboutOurClinicsId());
        feedback.setRecommendationCauses(recommendationCauses);
        feedback.setHearAboutOurClinic(hearAboutClinics);
        feedback.setId(updateDTO.getId());
        feedback = repository.save(feedback);
        log.info("Feedback succesfully updated {} with id", updateDTO.getId());
        return ResponseEntity.ok(toGetDTO(feedback));
    }

    public ResponseEntity<Long> delete(Long id) {
        repository.delete(id);
        log.info("Feedback succesfully delete {} with id", id);
        return ResponseEntity.ok(id);
    }

    public Feedback getPersist(Long id) {
        Optional<Feedback> optional = repository.findByIdAndIsDeleted(id, false);
        return optional.orElseThrow(() -> {
            log.warn("Feedback not found {} with id", id);
            throw new UniversalException("Feedback not found %s with".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }

    public FeedbackGetDTO toGetDTO(Feedback feedback) {
        FeedbackGetDTO feedbackGetDTO = mapper.toGetDTO(feedback);
        List<HearAboutClinicGetDTO> hearAboutClinicGetDTOs = hearAboutClinicService.toGetDTO(feedback.getHearAboutOurClinic());
        List<RecommendationCauseGetDTO> recommendationCauseGetDTOs = recommendationCauseService.toGetDTO(feedback.getRecommendationCauses());
        feedbackGetDTO.setHearAboutOurClinic(hearAboutClinicGetDTOs);
        feedbackGetDTO.setRecommendationCauses(recommendationCauseGetDTOs);
        return feedbackGetDTO;
    }
}

