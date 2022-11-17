package uz.bakhromjon.medapp.entities;

import lombok.*;
import uz.bakhromjon.medapp.entities.base.AbstractEntity;

import javax.persistence.Entity;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Article extends AbstractEntity {
    private String title;
    private String content;
    private Boolean isDeleted = false;
}
