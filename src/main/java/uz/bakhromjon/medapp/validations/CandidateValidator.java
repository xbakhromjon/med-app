package uz.bakhromjon.medapp.validations;

/**
 * @author : Bakhromjon Khasanboyev
 **/

import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.candidate.CandidateCreateDTO;
import uz.bakhromjon.medapp.dtos.candidate.CandidateUpdateDTO;
import uz.bakhromjon.medapp.validations.base.BaseValidator;



@Component
public class CandidateValidator implements BaseValidator {

    public void validForCreate(CandidateCreateDTO createDTO) {

    }

    public void validForUpdate(CandidateUpdateDTO updateDTO) {

    }
}
