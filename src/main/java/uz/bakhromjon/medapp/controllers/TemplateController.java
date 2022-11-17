package uz.bakhromjon.medapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.controllers.base.BaseCRUDController;
import uz.bakhromjon.medapp.dtos.template.TemplateCreateDTO;
import uz.bakhromjon.medapp.dtos.template.TemplateGetDTO;
import uz.bakhromjon.medapp.dtos.template.TemplateUpdateDTO;
import uz.bakhromjon.medapp.services.TemplateService;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RestController
@RequestMapping("/template")
public class TemplateController extends AbstractController<TemplateService>
        implements BaseCRUDController<TemplateGetDTO, TemplateCreateDTO, TemplateUpdateDTO, Long> {
    public TemplateController(TemplateService service) {
        super(service);
    }

    @PostMapping()
    @Override
    public ResponseEntity<TemplateGetDTO> create(@RequestBody(required = true) TemplateCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @GetMapping("/{id}")
    @Override
    public ResponseEntity<TemplateGetDTO> get(@PathVariable(name = "id") Long id) {
        return service.get(id);
    }

    @PutMapping()
    @Override
    public ResponseEntity<TemplateGetDTO> update(@RequestBody(required = true) TemplateUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @DeleteMapping("/{id}")
    @Override
    public ResponseEntity<Long> delete(@PathVariable(name = "id") Long id) {
        return service.delete(id);
    }
}
