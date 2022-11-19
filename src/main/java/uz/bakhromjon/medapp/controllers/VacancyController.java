package uz.bakhromjon.medapp.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.vacancy.VacancyCreateDTO;
import uz.bakhromjon.medapp.dtos.vacancy.VacancyUpdateDTO;
import uz.bakhromjon.medapp.services.VacancyService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/vacancy")
public class VacancyController extends AbstractController<VacancyService> {

    public VacancyController(VacancyService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody VacancyCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody VacancyUpdateDTO updateDTO) {
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

