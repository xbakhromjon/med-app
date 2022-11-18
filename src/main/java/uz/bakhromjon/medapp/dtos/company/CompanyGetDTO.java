package uz.bakhromjon.medapp.dtos.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.AbstractDTO;
import uz.bakhromjon.medapp.entities.Contact;
import uz.bakhromjon.medapp.entities.Link;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyGetDTO extends AbstractDTO {
    private String aboutUs;
    private String email;
    private List<Contact> contacts;
    private String address;
    private double latitude;
    private double longitude;
    private List<Link> links;
}
