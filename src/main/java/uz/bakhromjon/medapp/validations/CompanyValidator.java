package uz.bakhromjon.medapp.validations;

import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.company.CompanyCreateDTO;
import uz.bakhromjon.medapp.dtos.company.CompanyUpdateDTO;
import uz.bakhromjon.medapp.validations.base.BaseValidator;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Component
public class CompanyValidator implements BaseValidator {

    public void validForCreate(CompanyCreateDTO createDTO) {

    }

    public void validForUpdate(CompanyUpdateDTO updateDTO) {

    }
}
