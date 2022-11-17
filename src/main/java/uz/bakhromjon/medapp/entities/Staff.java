package uz.bakhromjon.medapp.entities;

import lombok.*;
import uz.bakhromjon.medapp.entities.base.AbstractEntity;


import javax.persistence.Entity;
import javax.persistence.OneToOne;


/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Staff extends AbstractEntity {
    @OneToOne
    private ContentFile photo;
    private String firstName;
    private String lastName;
    private String middleName;
    private String about;
    private String specialty;
    private String education;
    private Integer experience;
}
