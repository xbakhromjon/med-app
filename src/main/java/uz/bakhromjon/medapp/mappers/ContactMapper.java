package uz.bakhromjon.medapp.mappers;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.contact.ContactCreateDTO;
import uz.bakhromjon.medapp.entities.Contact;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface ContactMapper extends BaseMapper {
    List<Contact> toEntity(List<ContactCreateDTO> createDTOs);
}

