package uz.bakhromjon.medapp.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.article.ArticleCreateDTO;
import uz.bakhromjon.medapp.dtos.article.ArticleGetDTO;
import uz.bakhromjon.medapp.dtos.article.ArticleUpdateDTO;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.entities.Company;
import uz.bakhromjon.medapp.entities.Contact;
import uz.bakhromjon.medapp.entities.Link;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.ArticleMapper;
import uz.bakhromjon.medapp.repositories.ArticleRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.ArticleValidator;

import java.util.List;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class ArticleService extends AbstractService<ArticleRepository,
        ArticleMapper, ArticleValidator> {

    public ArticleService(ArticleRepository repository, ArticleMapper mapper, ArticleValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<ArticleGetDTO> create(ArticleCreateDTO createDTO) {
        validator.validForCreate(createDTO);
        Article article = mapper.toEntity(createDTO);
        Article saved = repository.save(article);
        return ResponseEntity.ok(mapper.toGetDTO(saved));
    }

    public ResponseEntity<ArticleGetDTO> get(Long id) {
        Article article = getPersist(id);
        return ResponseEntity.ok(mapper.toGetDTO(article));
    }

    public ResponseEntity<ArticleGetDTO> update(ArticleUpdateDTO updateDTO) {
        validator.validForUpdate(updateDTO);
        Article article = getPersist(updateDTO.getId());
        article.setContent(updateDTO.getContent());
        article.setTitle(updateDTO.getTitle());
        article = repository.save(article);
        return ResponseEntity.ok(mapper.toGetDTO(article));
    }

    public ResponseEntity<Long> delete(Long id) {
        repository.delete(id);
        return ResponseEntity.ok(id);
    }

    public Article getPersist(Long id) {
        Optional<Article> optional = repository.findByIdAndNotDeleted(id);
        return optional.orElseThrow(() -> {
            throw new UniversalException("Article not found %s with".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }
}

