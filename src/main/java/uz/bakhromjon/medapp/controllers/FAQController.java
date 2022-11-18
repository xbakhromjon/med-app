package uz.bakhromjon.medapp.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.faq.FAQCreateDTO;
import uz.bakhromjon.medapp.dtos.faq.FAQUpdateDTO;
import uz.bakhromjon.medapp.services.FAQService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/faq")
public class FAQController extends AbstractController<FAQService> {

    public FAQController(FAQService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody FAQCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody FAQUpdateDTO updateDTO) {
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

