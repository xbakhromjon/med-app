package uz.bakhromjon.medapp.entities;

import lombok.*;
import uz.bakhromjon.medapp.entities.base.Auditable;

import javax.persistence.Entity;

/**
 * @author : Bakhromjon Khasanboyev
 * @since : 30/09/22, Fri, 16:04
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Link extends Auditable {
    private String value;
    private Integer linkTypeCode;
}
