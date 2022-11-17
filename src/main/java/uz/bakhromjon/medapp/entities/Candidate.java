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
public class Candidate extends AbstractEntity {
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    @OneToOne
    private ContentFile resume;
}
