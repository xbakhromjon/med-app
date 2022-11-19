package uz.bakhromjon.medapp.dtos.recommendationCause;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecommendationCauseCreateDTO implements BaseDTO {
    private String cause;
}

