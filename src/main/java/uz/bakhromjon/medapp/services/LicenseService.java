package uz.bakhromjon.medapp.services;


import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.license.LicenseCreateDTO;
import uz.bakhromjon.medapp.dtos.license.LicenseGetDTO;
import uz.bakhromjon.medapp.dtos.license.LicenseUpdateDTO;
import uz.bakhromjon.medapp.mappers.LicenseMapper;
import uz.bakhromjon.medapp.repositories.LicenseRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.LicenseValidator;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class LicenseService extends AbstractService<LicenseRepository,
        LicenseMapper, LicenseValidator> {

    public LicenseService(LicenseRepository repository, LicenseMapper mapper, LicenseValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<LicenseGetDTO> create(LicenseCreateDTO createDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<LicenseGetDTO> get(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<LicenseGetDTO> update(LicenseUpdateDTO updateDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<Long> delete(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }
}

