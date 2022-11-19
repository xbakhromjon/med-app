package uz.bakhromjon.medapp.mappers;



import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.license.LicenseCreateDTO;
import uz.bakhromjon.medapp.dtos.license.LicenseGetDTO;
import uz.bakhromjon.medapp.entities.License;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface LicenseMapper extends BaseMapper {
    @Mapping(ignore = true, target = "contentFile")
    License toEntity(LicenseCreateDTO createDTO);

    LicenseGetDTO toGetDTO(License license);

}
