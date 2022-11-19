package uz.bakhromjon.medapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.template.TemplateCreateDTO;
import uz.bakhromjon.medapp.dtos.template.TemplateGetDTO;
import uz.bakhromjon.medapp.dtos.template.TemplateUpdateDTO;
import uz.bakhromjon.medapp.entities.Template;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.TemplateMapper;
import uz.bakhromjon.medapp.repositories.TemplateRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.services.base.BaseCRUDService;
import uz.bakhromjon.medapp.validations.TemplateValidator;

import java.util.List;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@Slf4j
public class TemplateService extends AbstractService<TemplateRepository, TemplateMapper, TemplateValidator> implements BaseCRUDService<TemplateGetDTO,
        TemplateCreateDTO, TemplateUpdateDTO, Long> {

    public TemplateService(TemplateRepository repository, TemplateMapper mapper, TemplateValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<TemplateGetDTO> create(TemplateCreateDTO createDTO) {
        validator.validateForCreate(createDTO);
        Template saved = repository.save(mapper.toEntity(createDTO));
        return ResponseEntity.ok(mapper.toGetDTO(saved));
    }

    public ResponseEntity<TemplateGetDTO> update(TemplateUpdateDTO updateDto) {
        validator.validateForUpdate(updateDto);
        Template template = getPersist(updateDto.getId());
        template.setDescription(updateDto.getDescription());
        template = repository.save(template);
        return ResponseEntity.ok(mapper.toGetDTO(template));
    }

    public ResponseEntity<TemplateGetDTO> get(Long id) {
        Optional<Template> optional = repository.findById(id);
        Template template = optional.orElseThrow(() -> {
            throw new UniversalException("Element not found", HttpStatus.NOT_FOUND);
        });
        return ResponseEntity.ok(mapper.toGetDTO(template));
    }

    public ResponseEntity<?> list() {
        List<Template> all = repository.findAll();
        return ResponseEntity.ok(all);
    }

    public ResponseEntity<Long> delete(Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok(id);
    }

    public Template getPersist(Long id) {
        Optional<Template> optional = repository.findById(id);
        return optional.orElseThrow(() -> {
            log.warn("Template not found %s with id".formatted(id));
            throw new UniversalException("Template not found %s with id".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }
}
