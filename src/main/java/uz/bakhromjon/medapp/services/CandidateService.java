package uz.bakhromjon.medapp.services;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.candidate.CandidateCreateDTO;
import uz.bakhromjon.medapp.dtos.candidate.CandidateGetDTO;
import uz.bakhromjon.medapp.dtos.candidate.CandidateUpdateDTO;
import uz.bakhromjon.medapp.mappers.CandidateMapper;
import uz.bakhromjon.medapp.repositories.CandidateRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.CandidateValidator;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class CandidateService extends AbstractService<CandidateRepository,
        CandidateMapper, CandidateValidator> {

    public CandidateService(CandidateRepository repository, CandidateMapper mapper, CandidateValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<CandidateGetDTO> create(CandidateCreateDTO createDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<CandidateGetDTO> get(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<CandidateGetDTO> update(CandidateUpdateDTO updateDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<Long> delete(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }
}

