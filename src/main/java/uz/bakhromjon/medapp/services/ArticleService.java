package uz.bakhromjon.medapp.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.article.ArticleCreateDTO;
import uz.bakhromjon.medapp.dtos.article.ArticleGetDTO;
import uz.bakhromjon.medapp.dtos.article.ArticleUpdateDTO;
import uz.bakhromjon.medapp.mappers.ArticleMapper;
import uz.bakhromjon.medapp.repositories.ArticleRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.ArticleValidator;

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
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<ArticleGetDTO> get(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<ArticleGetDTO> update(ArticleUpdateDTO updateDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<Long> delete(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }
}

