package uz.bakhromjon.medapp.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.vacancy.VacancyCreateDTO;
import uz.bakhromjon.medapp.dtos.vacancy.VacancyGetDTO;
import uz.bakhromjon.medapp.dtos.vacancy.VacancyUpdateDTO;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.entities.Candidate;
import uz.bakhromjon.medapp.entities.Vacancy;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.VacancyMapper;
import uz.bakhromjon.medapp.repositories.VacancyRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.VacancyValidator;

import java.util.Optional;


/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@Slf4j
public class VacancyService extends AbstractService<VacancyRepository,
        VacancyMapper, VacancyValidator> {

    public VacancyService(VacancyRepository repository, VacancyMapper mapper, VacancyValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<VacancyGetDTO> create(VacancyCreateDTO createDTO) {
        validator.validForCreate(createDTO);
        Vacancy vacancy = mapper.toEntity(createDTO);
        vacancy = repository.save(vacancy);
        log.info("Vacancy succesfully create {} with id", vacancy.getId());
        return ResponseEntity.ok(mapper.toGetDTO(vacancy));
    }

    public ResponseEntity<VacancyGetDTO> get(Long id) {
        Vacancy vacancy = getPersist(id);
        return ResponseEntity.ok(mapper.toGetDTO(vacancy));
    }

    public ResponseEntity<VacancyGetDTO> update(VacancyUpdateDTO updateDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<Long> delete(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public Vacancy getPersist(Long id) {
        Optional<Vacancy> optional = repository.findByIdAndNotDeleted(id);
        return optional.orElseThrow(() -> {
            throw new UniversalException("Vacancy not found %s with".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }

    public void save(Vacancy vacancy) {
        repository.save(vacancy);
    }
}

