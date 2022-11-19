package uz.bakhromjon.medapp.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.function.client.ClientHttpConnectorAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.license.LicenseCreateDTO;
import uz.bakhromjon.medapp.dtos.license.LicenseGetDTO;
import uz.bakhromjon.medapp.dtos.license.LicenseUpdateDTO;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.entities.License;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.LicenseMapper;
import uz.bakhromjon.medapp.repositories.LicenseRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.LicenseValidator;

import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@Slf4j
public class LicenseService extends AbstractService<LicenseRepository,
        LicenseMapper, LicenseValidator> {

    @Autowired
    private ContentFileService contentFileService;

    public LicenseService(LicenseRepository repository, LicenseMapper mapper, LicenseValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<LicenseGetDTO> create(LicenseCreateDTO createDTO) {
        validator.validForCreate(createDTO);
        License license = mapper.toEntity(createDTO);
        license.setContentFile(contentFileService.getPersist(createDTO.getContentFileId()));
        License saved = repository.save(license);
        log.info("License succesfully create {} with id", saved.getId());
        return ResponseEntity.ok(mapper.toGetDTO(saved));
    }

    public ResponseEntity<LicenseGetDTO> get(Long id) {
        License license = getPersist(id);
        log.info("Get license {} with id", id);
        return ResponseEntity.ok(mapper.toGetDTO(license));
    }

    public ResponseEntity<LicenseGetDTO> update(LicenseUpdateDTO updateDTO) {
        validator.validForUpdate(updateDTO);
        License license = getPersist(updateDTO.getId());
        license.setDefinition(updateDTO.getDefinition());
        license.setContentFile(contentFileService.getPersist(updateDTO.getContentFileId()));
        license = repository.save(license);
        log.info("License succesfully updated {} with id", updateDTO.getId());
        return ResponseEntity.ok(mapper.toGetDTO(license));
    }

    public ResponseEntity<Long> delete(Long id) {
        repository.delete(id);
        log.info("License succesfully delete {} with id", id);
        return ResponseEntity.ok(id);
    }

    public License getPersist(Long id) {
        Optional<License> optional = repository.findByIdAndIsDeleted(id, false);
        return optional.orElseThrow(() -> {
            log.warn("License not found {} with id", id);
            throw new UniversalException("License not found %s with".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }

}

