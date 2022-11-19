package uz.bakhromjon.medapp.dtos.feedback;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicGetDTO;
import uz.bakhromjon.medapp.dtos.recommendationCause.RecommendationCauseGetDTO;
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
public class FeedbackGetDTO implements BaseDTO {
    private String phoneNumber;
    private String email;
    private String patientCode;
    private String registryGrade;
    private String serviceGrade;
    private String medServiceGrade;
    private String cleanlinessGrade;
    private String staffAttentionGrade;
    private String qualityOfDoctorWorkGrade;
    private String workOfNurseOptometristGrade;
    private Boolean isPriceMatchQuality;
    private Boolean canRecommend;
    private List<RecommendationCauseGetDTO> recommendationCauses;
    private Boolean ourStaffYourTimeEnjoyable;
    private String name;
    private String suggestion;
    private List<HearAboutClinicGetDTO> hearAboutOurClinic;
}

