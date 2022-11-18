package uz.bakhromjon.medapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.article.ArticleCreateDTO;
import uz.bakhromjon.medapp.dtos.article.ArticleUpdateDTO;
import uz.bakhromjon.medapp.services.ArticleService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/article")
public class ArticleController extends AbstractController<ArticleService> {

    public ArticleController(ArticleService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ArticleCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ArticleUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable(name = "id") Long id) {
        return service.get(id);
    }

    @DeleteMapping()
    public ResponseEntity<?> delete(@RequestParam(name = "id") Long id) {
        return service.delete(id);
    }
}

