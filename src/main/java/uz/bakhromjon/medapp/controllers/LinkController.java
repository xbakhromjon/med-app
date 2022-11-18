package uz.bakhromjon.medapp.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.link.LinkCreateDTO;
import uz.bakhromjon.medapp.dtos.link.LinkUpdateDTO;
import uz.bakhromjon.medapp.services.LinkService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/link")
public class LinkController extends AbstractController<LinkService> {

    public LinkController(LinkService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody LinkCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody LinkUpdateDTO updateDTO) {
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
