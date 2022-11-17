package uz.bakhromjon.medapp.validations.base;


import uz.bakhromjon.medapp.dtos.base.AbstractDTO;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public abstract class AbstractValidator<CD extends BaseDTO, UD extends AbstractDTO> implements BaseValidator {

    public abstract void validateForCreate(CD createDTO);

    public abstract void validateForUpdate(UD updateDTO);
}
