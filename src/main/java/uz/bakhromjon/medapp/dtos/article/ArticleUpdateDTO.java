package uz.bakhromjon.medapp.dtos.article;


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
public class ArticleUpdateDTO extends AbstractDTO {
    private String description;
}
