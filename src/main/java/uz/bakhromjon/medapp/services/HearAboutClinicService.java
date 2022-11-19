package uz.bakhromjon.medapp.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicCreateDTO;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicGetDTO;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicUpdateDTO;
import uz.bakhromjon.medapp.entities.HearAboutClinic;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.HearAboutClinicMapper;
import uz.bakhromjon.medapp.repositories.HearAboutClinicRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.HearAboutClinicValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@Slf4j
public class HearAboutClinicService extends AbstractService<HearAboutClinicRepository,
        HearAboutClinicMapper, HearAboutClinicValidator> {

    public HearAboutClinicService(HearAboutClinicRepository repository, HearAboutClinicMapper mapper, HearAboutClinicValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<HearAboutClinicGetDTO> create(HearAboutClinicCreateDTO createDTO) {
        validator.validForCreate(createDTO);
        HearAboutClinic hearAboutClinic = mapper.toEntity(createDTO);
        hearAboutClinic = repository.save(hearAboutClinic);
        log.info("HearAboutClinic succesfully create {} with id", hearAboutClinic.getId());
        return ResponseEntity.ok(mapper.toGetDTO(hearAboutClinic));
    }

    public ResponseEntity<HearAboutClinicGetDTO> get(Long id) {
        HearAboutClinic hearAboutClinic = getPersist(id);
        return ResponseEntity.ok(mapper.toGetDTO(hearAboutClinic));
    }

    public ResponseEntity<HearAboutClinicGetDTO> update(HearAboutClinicUpdateDTO updateDTO) {
        validator.validForUpdate(updateDTO);
        HearAboutClinic hearAboutClinic = getPersist(updateDTO.getId());
        hearAboutClinic.setHearAboutClinic(updateDTO.getHearAboutClinic());
        hearAboutClinic = repository.save(hearAboutClinic);
        log.info("HearAboutClinic succesfully updated {} with id", updateDTO.getId());
        return ResponseEntity.ok(mapper.toGetDTO(hearAboutClinic));
    }

    public ResponseEntity<Long> delete(Long id) {
        repository.delete(id);
        log.info("HearAboutClinic succesfully delete {} with id", id);
        return ResponseEntity.ok(id);
    }


    public List<HearAboutClinic> getAll(List<Long> ids) {
        List<HearAboutClinic> hearAboutClinics = new ArrayList<>();
        for (Long id : ids) {
            hearAboutClinics.add(getPersist(id));
        }
        return hearAboutClinics;
    }


    public HearAboutClinic getPersist(Long id) {
        Optional<HearAboutClinic> optional = repository.findByIdAndIsDeleted(id, false);
        return optional.orElseThrow(() -> {
            log.warn("HearAboutClinic not found {} with id", id);
            throw new UniversalException("HearAboutClinic not found %s with".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }

    public HearAboutClinicGetDTO toGetDTO(HearAboutClinic hearAboutClinic) {
        return mapper.toGetDTO(hearAboutClinic);
    }

    public List<HearAboutClinicGetDTO> toGetDTO(List<HearAboutClinic> hearAboutClinics) {
        List<HearAboutClinicGetDTO> hearAboutClinicGetDTOs = new ArrayList<>();
        HearAboutClinicGetDTO hearAboutClinicGetDTO = null;
        for (HearAboutClinic hearAboutClinic : hearAboutClinics) {
            hearAboutClinicGetDTO = toGetDTO(hearAboutClinic);
            hearAboutClinicGetDTOs.add(hearAboutClinicGetDTO);
        }
        return hearAboutClinicGetDTOs;
    }
}

