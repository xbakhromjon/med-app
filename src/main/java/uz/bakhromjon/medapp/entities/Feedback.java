package uz.bakhromjon.medapp.entities;

import lombok.*;
import uz.bakhromjon.medapp.entities.base.AbstractEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Feedback extends AbstractEntity {
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
    @OneToMany
    private List<RecommendationCause> recommendationCauses;
    private Boolean ourStaffYourTimeEnjoyable;
    private String name;
    private String suggestion;
    @OneToMany
    private List<HearAboutClinic> hearAboutOurClinic;
}
