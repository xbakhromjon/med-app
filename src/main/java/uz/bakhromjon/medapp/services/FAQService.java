package uz.bakhromjon.medapp.services;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.faq.FAQCreateDTO;
import uz.bakhromjon.medapp.dtos.faq.FAQGetDTO;
import uz.bakhromjon.medapp.dtos.faq.FAQUpdateDTO;
import uz.bakhromjon.medapp.mappers.FAQMapper;
import uz.bakhromjon.medapp.repositories.FAQRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.FAQValidator;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class FAQService extends AbstractService<FAQRepository,
        FAQMapper, FAQValidator> {

    public FAQService(FAQRepository repository, FAQMapper mapper, FAQValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<FAQGetDTO> create(FAQCreateDTO createDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<FAQGetDTO> get(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<FAQGetDTO> update(FAQUpdateDTO updateDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<Long> delete(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }
}
