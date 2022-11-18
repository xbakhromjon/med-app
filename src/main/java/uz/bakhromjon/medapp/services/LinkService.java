package uz.bakhromjon.medapp.services;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import uz.bakhromjon.medapp.dtos.contact.ContactCreateDTO;
import uz.bakhromjon.medapp.dtos.link.LinkCreateDTO;
import uz.bakhromjon.medapp.dtos.link.LinkGetDTO;
import uz.bakhromjon.medapp.dtos.link.LinkUpdateDTO;
import uz.bakhromjon.medapp.entities.Contact;
import uz.bakhromjon.medapp.entities.Link;
import uz.bakhromjon.medapp.mappers.LinkMapper;
import uz.bakhromjon.medapp.repositories.LinkRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.LinkValidator;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class LinkService extends AbstractService<LinkRepository,
        LinkMapper, LinkValidator> {

    public LinkService(LinkRepository repository, LinkMapper mapper, LinkValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<LinkGetDTO> create(LinkCreateDTO createDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<LinkGetDTO> get(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<LinkGetDTO> update(LinkUpdateDTO updateDTO) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public ResponseEntity<Long> delete(Long id) {
        // TODO: 18/11/22 implement here
        return null;
    }

    public List<Link> saveAll(List<LinkCreateDTO> createDTOs) {
        List<Link> links = mapper.toEntity(createDTOs);
        links = repository.saveAll(links);
        return links;
    }
}

