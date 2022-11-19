package uz.bakhromjon.medapp.dtos.recommendationCause;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.AbstractDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecommendationCauseUpdateDTO implements AbstractDTO {
    private Long id;
    private String cause;
}

