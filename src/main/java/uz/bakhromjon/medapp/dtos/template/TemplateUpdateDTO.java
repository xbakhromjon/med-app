package uz.bakhromjon.medapp.dtos.template;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.AbstractDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/


@Setter
@Getter
@NoArgsConstructor
public class TemplateUpdateDTO implements AbstractDTO {
    private Long id;
    private String description;
}
