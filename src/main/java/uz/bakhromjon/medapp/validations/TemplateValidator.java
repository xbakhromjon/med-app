package uz.bakhromjon.medapp.validations;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.template.TemplateCreateDTO;
import uz.bakhromjon.medapp.dtos.template.TemplateUpdateDTO;
import uz.bakhromjon.medapp.exceptions.ValidationException;
import uz.bakhromjon.medapp.validations.base.AbstractValidator;


/**
 * @author : Bakhromjon Khasanboyev
 **/
@Component
@Slf4j
public class TemplateValidator extends AbstractValidator<TemplateCreateDTO, TemplateUpdateDTO> {
    @Override
    public void validateForCreate(TemplateCreateDTO createDTO) {
        if (createDTO == null) {
            log.warn("Response body cannot be null for template create");
            throw new ValidationException("Response body cannot be null for template create");
        }
        if (createDTO.getDescription() == null) {
            log.warn("Description cannot be null for template create");
            throw new ValidationException("Description cannot be null for template create");
        }
    }

    @Override
    public void validateForUpdate(TemplateUpdateDTO updateDTO) {
        if (updateDTO == null) {
            log.warn("Response body cannot be null for template update");
            throw new ValidationException("Response body cannot be null for template update");
        }
        if (updateDTO.getDescription() == null) {
            log.warn("Description cannot be null for template update");
            throw new ValidationException("Description cannot be null for template update");
        }
    }
}
