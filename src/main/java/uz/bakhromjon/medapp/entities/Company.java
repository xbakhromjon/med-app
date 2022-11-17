package uz.bakhromjon.medapp.entities;

import lombok.*;
import uz.bakhromjon.medapp.entities.base.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Company extends AbstractEntity {
    private String aboutUs;
    private String email;
    @OneToMany
    private List<Contact> contacts;
    private String address;
    private double latitude;
    private double longitude;
    @OneToMany
    private List<Link> links;
}
