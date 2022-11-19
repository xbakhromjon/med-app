package uz.bakhromjon.medapp.validations;

/**
 * @author : Bakhromjon Khasanboyev
 **/

import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.license.LicenseCreateDTO;
import uz.bakhromjon.medapp.dtos.license.LicenseUpdateDTO;
import uz.bakhromjon.medapp.validations.base.BaseValidator;



@Component
public class LicenseValidator implements BaseValidator {

    public void validForCreate(LicenseCreateDTO createDTO) {

    }

    public void validForUpdate(LicenseUpdateDTO updateDTO) {

    }
}
