package uz.bakhromjon.medapp.validations;

/**
 * @author : Bakhromjon Khasanboyev
 **/

import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.vacancy.VacancyCreateDTO;
import uz.bakhromjon.medapp.validations.base.BaseValidator;



@Component
public class VacancyValidator implements BaseValidator {

    public void validForCreate(VacancyCreateDTO createDTO) {

    }
}
