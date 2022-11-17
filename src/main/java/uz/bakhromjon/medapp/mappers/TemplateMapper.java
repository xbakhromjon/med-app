package uz.bakhromjon.medapp.mappers;

import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.template.TemplateCreateDTO;
import uz.bakhromjon.medapp.dtos.template.TemplateGetDTO;
import uz.bakhromjon.medapp.dtos.template.TemplateUpdateDTO;
import uz.bakhromjon.medapp.entities.Template;
import uz.bakhromjon.medapp.mappers.base.AbstractMapper;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Component
public class TemplateMapper implements BaseMapper, AbstractMapper<Template, TemplateCreateDTO, TemplateUpdateDTO, TemplateGetDTO> {
    @Override
    public Template toEntity(TemplateCreateDTO createDTO) {
        if (createDTO == null) return null;
        return new Template(createDTO.getDescription());
    }

    @Override
    public Template toEntity(TemplateUpdateDTO updateDTO) {
        if (updateDTO == null) return null;
        return new Template(updateDTO.getDescription());
    }

    @Override
    public TemplateGetDTO toGetDTO(Template entity) {
        if (entity == null) return null;
        return new TemplateGetDTO(entity.getId(), entity.getDescription());
    }

    @Override
    public List<TemplateGetDTO> toGetDTO(List<Template> entities) {
        List<TemplateGetDTO> list = new ArrayList<>();
        for (Template entity : entities) {
            list.add(toGetDTO(entity));
        }
        return list;
    }
}
