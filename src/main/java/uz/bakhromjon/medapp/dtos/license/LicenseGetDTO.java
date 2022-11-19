package uz.bakhromjon.medapp.dtos.license;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.AbstractDTO;
import uz.bakhromjon.medapp.dtos.contentFile.ContentFileGetDTO;
import uz.bakhromjon.medapp.entities.ContentFile;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LicenseGetDTO implements AbstractDTO {
    private Long id;
    private ContentFileGetDTO contentFile;
    private String definition;
}
