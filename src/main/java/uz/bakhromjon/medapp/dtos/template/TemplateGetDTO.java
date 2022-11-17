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
public class TemplateGetDTO extends AbstractDTO {
    private String description;
    @Builder
    public TemplateGetDTO(Long id, String description) {
        super(id);
        this.description = description;
    }
}
