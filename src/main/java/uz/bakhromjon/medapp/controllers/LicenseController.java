package uz.bakhromjon.medapp.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.license.LicenseCreateDTO;
import uz.bakhromjon.medapp.dtos.license.LicenseUpdateDTO;
import uz.bakhromjon.medapp.services.LicenseService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/license")
public class LicenseController extends AbstractController<LicenseService> {

    public LicenseController(LicenseService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody LicenseCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody LicenseUpdateDTO updateDTO) {
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

