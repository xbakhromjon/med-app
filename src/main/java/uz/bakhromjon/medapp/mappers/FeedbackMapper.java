package uz.bakhromjon.medapp.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uz.bakhromjon.medapp.dtos.feedback.FeedbackCreateDTO;
import uz.bakhromjon.medapp.dtos.feedback.FeedbackGetDTO;
import uz.bakhromjon.medapp.dtos.feedback.FeedbackUpdateDTO;
import uz.bakhromjon.medapp.entities.Feedback;
import uz.bakhromjon.medapp.enums.Grade;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface FeedbackMapper extends BaseMapper {

    @Mapping(ignore = true, target = "recommendationCauses")
    @Mapping(ignore = true, target = "hearAboutOurClinic")
    Feedback toEntity(FeedbackCreateDTO createDTO);

    @Mapping(ignore = true, target = "recommendationCauses")
    @Mapping(ignore = true, target = "hearAboutOurClinic")
    Feedback toEntity(FeedbackUpdateDTO updateDTO);


    default FeedbackGetDTO toGetDTO(Feedback feedback) {
        if (feedback == null) return null;
        FeedbackGetDTO feedbackGetDTO = new FeedbackGetDTO();
        feedbackGetDTO.setEmail(feedback.getEmail());
        feedbackGetDTO.setPatientCode(feedback.getPatientCode());
        feedbackGetDTO.setRegistryGrade(Grade.toString(feedback.getRegistry()));
        feedbackGetDTO.setServiceGrade(Grade.toString(feedback.getService()));
        feedbackGetDTO.setMedServiceGrade(Grade.toString(feedback.getMedService()));
        feedbackGetDTO.setCleanlinessGrade(Grade.toString(feedback.getCleanliness()));
        feedbackGetDTO.setStaffAttentionGrade(Grade.toString(feedback.getStaffAttention()));
        feedbackGetDTO.setQualityOfDoctorWorkGrade(Grade.toString(feedback.getQualityOfDoctorWork()));
        feedbackGetDTO.setWorkOfNurseOptometristGrade(Grade.toString(feedback.getWorkOfNurseOptometrist()));
        feedbackGetDTO.setIsPriceMatchQuality(feedback.getIsPriceMatchQuality());
        feedbackGetDTO.setCanRecommend(feedback.getCanRecommend());
        feedbackGetDTO.setOurStaffYourTimeEnjoyable(feedback.getOurStaffYourTimeEnjoyable());
        feedbackGetDTO.setName(feedbackGetDTO.getName());
        feedbackGetDTO.setSuggestion(feedbackGetDTO.getSuggestion());
        return feedbackGetDTO;
    }


}

