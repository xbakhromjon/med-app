package uz.bakhromjon.medapp.dtos.template;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class TemplateCreateDTO implements BaseDTO {
    private String description;
}
