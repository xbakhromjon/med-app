package uz.bakhromjon.medapp.mappers;


import org.mapstruct.Mapper;
import uz.bakhromjon.medapp.dtos.vacancy.VacancyCreateDTO;
import uz.bakhromjon.medapp.dtos.vacancy.VacancyGetDTO;
import uz.bakhromjon.medapp.entities.Vacancy;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface VacancyMapper extends BaseMapper {
    Vacancy toEntity(VacancyCreateDTO createDTO);

    VacancyGetDTO toGetDTO(Vacancy vacancy);
}
