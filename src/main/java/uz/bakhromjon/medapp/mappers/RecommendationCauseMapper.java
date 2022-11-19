package uz.bakhromjon.medapp.mappers;


import org.mapstruct.Mapper;
import uz.bakhromjon.medapp.dtos.recommendationCause.RecommendationCauseCreateDTO;
import uz.bakhromjon.medapp.dtos.recommendationCause.RecommendationCauseGetDTO;
import uz.bakhromjon.medapp.entities.RecommendationCause;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface RecommendationCauseMapper extends BaseMapper {
    RecommendationCause toEntity(RecommendationCauseCreateDTO createDTO);

    RecommendationCauseGetDTO toGetDTO(RecommendationCause recommendationCause);

}


