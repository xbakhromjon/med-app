package uz.bakhromjon.medapp.dtos.candidate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.AbstractDTO;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;
import uz.bakhromjon.medapp.dtos.contentFile.ContentFileGetDTO;
import uz.bakhromjon.medapp.entities.ContentFile;

import javax.persistence.OneToOne;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CandidateGetDTO implements AbstractDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private ContentFileGetDTO resume;
}

