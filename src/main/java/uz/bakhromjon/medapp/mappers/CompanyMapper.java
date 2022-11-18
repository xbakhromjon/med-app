package uz.bakhromjon.medapp.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.MapperConfig;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.company.CompanyCreateDTO;
import uz.bakhromjon.medapp.dtos.company.CompanyGetDTO;
import uz.bakhromjon.medapp.entities.Company;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface CompanyMapper extends BaseMapper {
    @Mapping(target = "contacts", ignore = true)
    @Mapping(target = "links", ignore = true)
    Company toEntity(CompanyCreateDTO createDTO);

    CompanyGetDTO toGetDTO(Company company);
}
