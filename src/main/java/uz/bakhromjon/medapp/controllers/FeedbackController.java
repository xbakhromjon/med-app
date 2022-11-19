package uz.bakhromjon.medapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.feedback.FeedbackCreateDTO;
import uz.bakhromjon.medapp.dtos.feedback.FeedbackUpdateDTO;
import uz.bakhromjon.medapp.services.FeedbackService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/feedback")
public class FeedbackController extends AbstractController<FeedbackService> {

    public FeedbackController(FeedbackService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody FeedbackCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody FeedbackUpdateDTO updateDTO) {
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

