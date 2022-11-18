package uz.bakhromjon.medapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.dtos.candidate.CandidateCreateDTO;
import uz.bakhromjon.medapp.dtos.candidate.CandidateUpdateDTO;
import uz.bakhromjon.medapp.services.CandidateService;

/**
 * @author : Bakhromjon Khasanboyev
 **/

@RestController
@RequestMapping("/candidate")
public class CandidateController extends AbstractController<CandidateService> {

    public CandidateController(CandidateService service) {
        super(service);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CandidateCreateDTO createDTO) {
        return service.create(createDTO);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody CandidateUpdateDTO updateDTO) {
        return service.update(updateDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable(name = "id") Long id) {
        return service.get(id);
    }

}

