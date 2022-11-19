package uz.bakhromjon.medapp.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.article.ArticleCreateDTO;
import uz.bakhromjon.medapp.dtos.article.ArticleGetDTO;
import uz.bakhromjon.medapp.dtos.article.ArticleUpdateDTO;
import uz.bakhromjon.medapp.entities.Article;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.ArticleMapper;
import uz.bakhromjon.medapp.repositories.ArticleRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.ArticleValidator;

import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
@Slf4j
public class ArticleService extends AbstractService<ArticleRepository,
        ArticleMapper, ArticleValidator> {

    public ArticleService(ArticleRepository repository, ArticleMapper mapper, ArticleValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<ArticleGetDTO> create(ArticleCreateDTO createDTO) {
        validator.validForCreate(createDTO);
        Article article = mapper.toEntity(createDTO);
        Article saved = repository.save(article);
        log.info("Article succesfully create {} with id", saved.getId());
        return ResponseEntity.ok(mapper.toGetDTO(saved));
    }

    public ResponseEntity<ArticleGetDTO> get(Long id) {
        Article article = getPersist(id);
        log.info("Get article {} with id", id);
        return ResponseEntity.ok(mapper.toGetDTO(article));
    }

    public ResponseEntity<ArticleGetDTO> update(ArticleUpdateDTO updateDTO) {
        validator.validForUpdate(updateDTO);
        Article article = getPersist(updateDTO.getId());
        article.setContent(updateDTO.getContent());
        article.setTitle(updateDTO.getTitle());
        article = repository.save(article);
        log.info("Article succesfully updated {} with id", updateDTO.getId());
        return ResponseEntity.ok(mapper.toGetDTO(article));
    }

    public ResponseEntity<Long> delete(Long id) {
        repository.delete(id);
        log.info("Article succesfully delete {} with id", id);
        return ResponseEntity.ok(id);
    }

    public Article getPersist(Long id) {
        Optional<Article> optional = repository.findByIdAndIsDeleted(id, false);
        return optional.orElseThrow(() -> {
            log.warn("Article not found {} with id", id);
            throw new UniversalException("Article not found %s with".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }
}

