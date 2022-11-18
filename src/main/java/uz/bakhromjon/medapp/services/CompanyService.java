package uz.bakhromjon.medapp.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.company.CompanyCreateDTO;
import uz.bakhromjon.medapp.dtos.company.CompanyGetDTO;
import uz.bakhromjon.medapp.dtos.company.CompanyUpdateDTO;
import uz.bakhromjon.medapp.mappers.CompanyMapper;
import uz.bakhromjon.medapp.repositories.CompanyRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.CompanyValidator;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class CompanyService extends AbstractService<CompanyRepository,
        CompanyMapper, CompanyValidator> {

    public CompanyService(CompanyRepository repository, CompanyMapper mapper, CompanyValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<CompanyGetDTO> create(CompanyCreateDTO createDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<CompanyGetDTO> get(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<CompanyGetDTO> update(CompanyUpdateDTO updateDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<Long> delete(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }
}
