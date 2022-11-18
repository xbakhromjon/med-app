package uz.bakhromjon.medapp.dtos.link;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.AbstractDTO;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LinkGetDTO implements AbstractDTO {
    private Long id;
    private String value;
    private Integer linkTypeCode;
}


