package uz.bakhromjon.medapp.dtos.template;

import lombok.*;
import uz.bakhromjon.medapp.dtos.base.AbstractDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TemplateGetDTO implements AbstractDTO {
    private Long id;
    private String description;
}
