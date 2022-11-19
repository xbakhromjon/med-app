package uz.bakhromjon.medapp.dtos.feedback;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;
import uz.bakhromjon.medapp.entities.HearAboutClinic;
import uz.bakhromjon.medapp.entities.RecommendationCause;

import javax.persistence.OneToMany;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackCreateDTO implements BaseDTO {
    private String phoneNumber;
    private String email;
    private String patientCode;
    private Integer registry = -1;
    private Integer service = -1;
    private Integer medService = -1;
    private Integer cleanliness = -1;
    private Integer staffAttention = -1;
    private Integer qualityOfDoctorWork = -1;
    private Integer workOfNurseOptometrist = -1;
    private Boolean isPriceMatchQuality;
    private Boolean canRecommend;
    private List<Long> recommendationCausesId;
    private Boolean ourStaffYourTimeEnjoyable;
    private String name;
    private String suggestion;
    private List<Long> hearAboutOurClinicsId;
}

