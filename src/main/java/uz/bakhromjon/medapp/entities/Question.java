
package uz.bakhromjon.medapp.entities;

import lombok.*;
import uz.bakhromjon.medapp.entities.base.Auditable;

import javax.persistence.Entity;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question extends Auditable {
    private String question;
    private String phoneNumber;
    private String email;
    private String answer;
}
