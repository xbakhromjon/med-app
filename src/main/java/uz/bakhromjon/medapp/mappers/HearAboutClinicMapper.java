package uz.bakhromjon.medapp.mappers;

import org.mapstruct.Mapper;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicCreateDTO;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicGetDTO;
import uz.bakhromjon.medapp.entities.HearAboutClinic;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface HearAboutClinicMapper extends BaseMapper {
    HearAboutClinic toEntity(HearAboutClinicCreateDTO createDTO);

    HearAboutClinicGetDTO toGetDTO(HearAboutClinic hearAboutClinic);
}


