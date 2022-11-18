package uz.bakhromjon.medapp.mappers;


import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.link.LinkCreateDTO;
import uz.bakhromjon.medapp.entities.Link;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface LinkMapper extends BaseMapper {
    List<Link> toEntity(List<LinkCreateDTO> createDTOs);
}

