package uz.bakhromjon.medapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.company.CompanyCreateDTO;
import uz.bakhromjon.medapp.dtos.company.CompanyUpdateDTO;
import uz.bakhromjon.medapp.services.CompanyService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/company")
public class CompanyController extends AbstractController<CompanyService> {

    public CompanyController(CompanyService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CompanyCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody CompanyUpdateDTO updateDTO) {
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

