package uz.bakhromjon.medapp.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.entities.base.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.Table;


/**
 * @author : Bakhromjon Khasanboyev
 * @since : 17/11/22, Thu, 06:17
 **/


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "template")
public class Template extends AbstractEntity {

    private String description;

    public Template(Long ID, String description) {
        super(ID);
        this.description = description;
    }

    public Template(String description) {
        this.description = description;
    }
}
