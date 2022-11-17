package uz.bakhromjon.medapp.dtos.partner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.entities.Contact;
import uz.bakhromjon.medapp.entities.ContentFile;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartnerGetDTO {
    private ContentFile logo;
    private String definition;
    private String website;
    private List<Contact> contacts;
}
