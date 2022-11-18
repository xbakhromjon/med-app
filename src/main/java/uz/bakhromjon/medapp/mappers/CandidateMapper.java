package uz.bakhromjon.medapp.mappers;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.candidate.CandidateCreateDTO;
import uz.bakhromjon.medapp.dtos.candidate.CandidateGetDTO;
import uz.bakhromjon.medapp.entities.Candidate;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface CandidateMapper extends BaseMapper {
    @Mapping(ignore = true, target = "resume")
    Candidate toEntity(CandidateCreateDTO createDTO);

    CandidateGetDTO toGetDTO(Candidate candidate);
}
