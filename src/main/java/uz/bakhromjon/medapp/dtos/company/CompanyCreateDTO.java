package uz.bakhromjon.medapp.dtos.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.mapstruct.Mapper;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;
import uz.bakhromjon.medapp.dtos.contact.ContactCreateDTO;
import uz.bakhromjon.medapp.dtos.link.LinkCreateDTO;
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
public class CompanyCreateDTO implements BaseDTO {
    private String aboutUs;
    private String email;
    private List<ContactCreateDTO> contacts;
    private String address;
    private double latitude;
    private double longitude;
    private List<LinkCreateDTO> links;
}
