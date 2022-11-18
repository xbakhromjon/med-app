package uz.bakhromjon.medapp.mappers;


import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.dtos.article.ArticleCreateDTO;
import uz.bakhromjon.medapp.dtos.article.ArticleGetDTO;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.entities.Company;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Mapper(componentModel = "spring")
public interface ArticleMapper extends BaseMapper {

    Article toEntity(ArticleCreateDTO createDTO);

    ArticleGetDTO toGetDTO(Article article);
}
