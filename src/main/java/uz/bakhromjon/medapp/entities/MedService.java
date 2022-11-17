package uz.bakhromjon.medapp.entities;

import lombok.*;
import org.hibernate.annotations.Type;
import uz.bakhromjon.medapp.entities.base.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class MedService extends AbstractEntity {
    private String title;
    @Type(type = "text")
    private String content; // kasallik haqida. Xizmat haqida
    private Boolean isAvailable = false;
    @OneToMany
    private List<ServiceCost> serviceCosts;
}
