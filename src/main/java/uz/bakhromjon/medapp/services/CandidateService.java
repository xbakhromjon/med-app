package uz.bakhromjon.medapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.candidate.CandidateCreateDTO;
import uz.bakhromjon.medapp.dtos.candidate.CandidateGetDTO;
import uz.bakhromjon.medapp.dtos.candidate.CandidateUpdateDTO;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.entities.Candidate;
import uz.bakhromjon.medapp.entities.ContentFile;
import uz.bakhromjon.medapp.entities.Vacancy;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.CandidateMapper;
import uz.bakhromjon.medapp.repositories.CandidateRepository;
import uz.bakhromjon.medapp.repositories.VacancyRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.CandidateValidator;

import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class CandidateService extends AbstractService<CandidateRepository,
        CandidateMapper, CandidateValidator> {

    @Autowired
    private VacancyService vacancyService;

    @Autowired
    private ContentFileService contentFileService;

    public CandidateService(CandidateRepository repository, CandidateMapper mapper, CandidateValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<CandidateGetDTO> create(CandidateCreateDTO createDTO) {
        validator.validForCreate(createDTO);
        Vacancy vacancy = vacancyService.getPersist(createDTO.getVacancyId());
        Candidate candidate = mapper.toEntity(createDTO);
        candidate = repository.save(candidate);
        vacancy.getCandidates().add(candidate);
        vacancyService.save(vacancy);
        return ResponseEntity.ok(mapper.toGetDTO(candidate));
    }

    public ResponseEntity<CandidateGetDTO> get(Long id) {
        Candidate candidate = getPersist(id);
        return ResponseEntity.ok(mapper.toGetDTO(candidate));
    }

    public ResponseEntity<CandidateGetDTO> update(CandidateUpdateDTO updateDTO) {
        validator.validForUpdate(updateDTO);
        Candidate candidate = getPersist(updateDTO.getId());
        candidate.setEmail(updateDTO.getEmail());
        candidate.setFirstname(updateDTO.getFirstname());
        candidate.setLastname(updateDTO.getLastname());
        candidate.setPhoneNumber(updateDTO.getPhoneNumber());
        ContentFile resume = contentFileService.getPersist(updateDTO.getResumeId());
        candidate.setResume(resume);
        candidate = repository.save(candidate);
        return ResponseEntity.ok(mapper.toGetDTO(candidate));
    }


    public Candidate getPersist(Long id) {
        Optional<Candidate> optional = repository.findById(id);
        return optional.orElseThrow(() -> {
            throw new UniversalException("Candidate not found %s with".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }
}

