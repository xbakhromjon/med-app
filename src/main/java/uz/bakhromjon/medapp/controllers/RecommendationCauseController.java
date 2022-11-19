package uz.bakhromjon.medapp.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;

import uz.bakhromjon.medapp.dtos.recommendationCause.RecommendationCauseCreateDTO;
import uz.bakhromjon.medapp.dtos.recommendationCause.RecommendationCauseUpdateDTO;
import uz.bakhromjon.medapp.services.RecommendationCauseService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/recommendation-cause")
public class RecommendationCauseController extends AbstractController<RecommendationCauseService> {

    public RecommendationCauseController(RecommendationCauseService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RecommendationCauseCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody RecommendationCauseUpdateDTO updateDTO) {
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

