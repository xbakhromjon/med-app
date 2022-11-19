package uz.bakhromjon.medapp.dtos.contentFile;

import uz.bakhromjon.medapp.dtos.base.AbstractDTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;
import uz.bakhromjon.medapp.entities.ContentFile;

import javax.persistence.OneToOne;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContentFileGetDTO implements AbstractDTO {
    private Long id;
    private String originalName;
    private String generatedName;
    private Long size;
    private String contentType;
}
