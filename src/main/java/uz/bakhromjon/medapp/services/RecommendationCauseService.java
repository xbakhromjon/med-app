package uz.bakhromjon.medapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicGetDTO;
import uz.bakhromjon.medapp.dtos.recommendationCause.RecommendationCauseCreateDTO;
import uz.bakhromjon.medapp.dtos.recommendationCause.RecommendationCauseGetDTO;
import uz.bakhromjon.medapp.dtos.recommendationCause.RecommendationCauseUpdateDTO;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.entities.Feedback;
import uz.bakhromjon.medapp.entities.HearAboutClinic;
import uz.bakhromjon.medapp.entities.RecommendationCause;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.RecommendationCauseMapper;
import uz.bakhromjon.medapp.repositories.RecommendationCauseRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.RecommendationCauseValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@Slf4j
public class RecommendationCauseService extends AbstractService<RecommendationCauseRepository,
        RecommendationCauseMapper, RecommendationCauseValidator> {

    public RecommendationCauseService(RecommendationCauseRepository repository, RecommendationCauseMapper mapper, RecommendationCauseValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<RecommendationCauseGetDTO> create(RecommendationCauseCreateDTO createDTO) {
        validator.validForCreate(createDTO);
        RecommendationCause recommendationCause = mapper.toEntity(createDTO);
        recommendationCause = repository.save(recommendationCause);
        log.info("RecommendationCause succesfully create {} with id", recommendationCause.getId());
        return ResponseEntity.ok(mapper.toGetDTO(recommendationCause));
    }

    public ResponseEntity<RecommendationCauseGetDTO> get(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<RecommendationCauseGetDTO> update(RecommendationCauseUpdateDTO updateDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<Long> delete(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public List<RecommendationCause> getAll(List<Long> ids) {
        List<RecommendationCause> recommendationCauses = new ArrayList<>();
        for (Long id : ids) {
            recommendationCauses.add(getPersist(id));
        }
        return recommendationCauses;
    }


    public RecommendationCause getPersist(Long id) {
        Optional<RecommendationCause> optional = repository.findByIdAndIsDeleted(id, false);
        return optional.orElseThrow(() -> {
            log.warn("RecommendationCause not found {} with id", id);
            throw new UniversalException("RecommendationCause not found %s with".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }

    public RecommendationCauseGetDTO toGetDTO(RecommendationCause recommendationCause) {
        return mapper.toGetDTO(recommendationCause);
    }

    public List<RecommendationCauseGetDTO> toGetDTO(List<RecommendationCause> recommendationCauses) {
        List<RecommendationCauseGetDTO> recommendationCauseGetDTOs = new ArrayList<>();
        for (RecommendationCause recommendationCause : recommendationCauses) {
            recommendationCauseGetDTOs.add(toGetDTO(recommendationCause));
        }
        return recommendationCauseGetDTOs;
    }
}

