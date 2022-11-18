package uz.bakhromjon.medapp.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.contact.ContactCreateDTO;
import uz.bakhromjon.medapp.dtos.contact.ContactUpdateDTO;
import uz.bakhromjon.medapp.services.ContactService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/contact")
public class ContactController extends AbstractController<ContactService> {

    public ContactController(ContactService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ContactCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody ContactUpdateDTO updateDTO) {
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

