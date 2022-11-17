package uz.bakhromjon.medapp.dtos.license;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.entities.ContentFile;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LicenseGetDTO {
    private ContentFile contentFile;
    private String definition;
}
