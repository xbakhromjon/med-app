package uz.bakhromjon.medapp.entities;

import lombok.*;
import uz.bakhromjon.medapp.entities.base.Auditable;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ContentFile extends Auditable {
    private String path;
    private String originalName;
    private String generatedName;
    private Long size;
    private String contentType;
}
