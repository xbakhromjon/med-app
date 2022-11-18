package uz.bakhromjon.medapp.services;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.contact.ContactCreateDTO;
import uz.bakhromjon.medapp.dtos.contact.ContactGetDTO;
import uz.bakhromjon.medapp.dtos.contact.ContactUpdateDTO;
import uz.bakhromjon.medapp.entities.Contact;
import uz.bakhromjon.medapp.mappers.ContactMapper;
import uz.bakhromjon.medapp.repositories.ContactRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.ContactValidator;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class ContactService extends AbstractService<ContactRepository,
        ContactMapper, ContactValidator> {

    public ContactService(ContactRepository repository, ContactMapper mapper, ContactValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<ContactGetDTO> create(ContactCreateDTO createDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<ContactGetDTO> get(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<ContactGetDTO> update(ContactUpdateDTO updateDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<Long> delete(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public List<Contact> saveAll(List<ContactCreateDTO> createDTOs) {
        List<Contact> contacts = mapper.toEntity(createDTOs);
        contacts = repository.saveAll(contacts);
        return contacts;
    }
}

