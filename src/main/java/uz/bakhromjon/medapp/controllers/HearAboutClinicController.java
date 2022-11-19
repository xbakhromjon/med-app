package uz.bakhromjon.medapp.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicCreateDTO;
import uz.bakhromjon.medapp.dtos.hearAboutClinic.HearAboutClinicUpdateDTO;
import uz.bakhromjon.medapp.services.HearAboutClinicService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/hear-about-clinic")
public class HearAboutClinicController extends AbstractController<HearAboutClinicService> {

    public HearAboutClinicController(HearAboutClinicService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody HearAboutClinicCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody HearAboutClinicUpdateDTO updateDTO) {
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

