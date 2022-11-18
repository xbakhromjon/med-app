package uz.bakhromjon.medapp.dtos.candidate;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.AbstractDTO;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CandidateUpdateDTO implements AbstractDTO {
    private Long id;
    private Long vacancyId;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private Long resumeId;
}

