package uz.bakhromjon.medapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import uz.bakhromjon.medapp.dtos.company.CompanyCreateDTO;
import uz.bakhromjon.medapp.dtos.company.CompanyGetDTO;
import uz.bakhromjon.medapp.dtos.company.CompanyUpdateDTO;
import uz.bakhromjon.medapp.entities.Company;
import uz.bakhromjon.medapp.entities.Contact;
import uz.bakhromjon.medapp.entities.Link;
import uz.bakhromjon.medapp.exceptions.UniversalException;
import uz.bakhromjon.medapp.mappers.CompanyMapper;
import uz.bakhromjon.medapp.repositories.CompanyRepository;
import uz.bakhromjon.medapp.services.base.AbstractService;
import uz.bakhromjon.medapp.validations.CompanyValidator;

import java.util.List;
import java.util.Optional;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Service
public class CompanyService extends AbstractService<CompanyRepository, CompanyMapper, CompanyValidator> {

    @Autowired
    private ContactService contactService;
    @Autowired
    private LinkService linkService;

    public CompanyService(CompanyRepository repository, CompanyMapper mapper, CompanyValidator validator) {
        super(repository, mapper, validator);
    }

    public ResponseEntity<?> create(CompanyCreateDTO createDTO) {
        int count = repository.getCount();
        if (count >= 1) {
            return new ResponseEntity<>("You cannot multiple company", HttpStatus.BAD_REQUEST);
        }
        validator.validForCreate(createDTO);
        Company company = mapper.toEntity(createDTO);
        List<Contact> contacts = contactService.saveAll(createDTO.getContacts());
        List<Link> links = linkService.saveAll(createDTO.getLinks());
        company.setContacts(contacts);
        company.setLinks(links);
        Company saved = repository.save(company);
        return ResponseEntity.ok(mapper.toGetDTO(saved));
    }

    public ResponseEntity<CompanyGetDTO> get(Long id) {
        Company company = getPersist(id);
        return ResponseEntity.ok(mapper.toGetDTO(company));
    }

    public Company getPersist(Long id) {
        Optional<Company> optional = repository.findById(id);
        return optional.orElseThrow(() -> {
            throw new UniversalException("Company not found %s with".formatted(id), HttpStatus.BAD_REQUEST);
        });
    }

    public ResponseEntity<CompanyGetDTO> update(CompanyUpdateDTO updateDTO) {
        validator.validForUpdate(updateDTO);
        Company company = getPersist(updateDTO.getId());
        company.setAddress(updateDTO.getAddress());
        company.setEmail(updateDTO.getEmail());
        company.setLatitude(updateDTO.getLatitude());
        company.setLongitude(updateDTO.getLongitude());
        company.setAboutUs(updateDTO.getAboutUs());
        List<Contact> contacts = contactService.saveAll(updateDTO.getContacts());
        List<Link> links = linkService.saveAll(updateDTO.getLinks());
        company.setContacts(contacts);
        company.setLinks(links);
        Company updated = repository.save(company);
        return ResponseEntity.ok(mapper.toGetDTO(updated));
    }
}
