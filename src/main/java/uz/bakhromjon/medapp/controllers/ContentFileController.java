package uz.bakhromjon.medapp.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import uz.bakhromjon.medapp.controllers.base.AbstractController;
import uz.bakhromjon.medapp.services.ContentFileService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RestController
@RequestMapping("/content-file")
public class ContentFileController extends AbstractController<ContentFileService> {

    public ContentFileController(ContentFileService service) {
        super(service);
    }

    @PostMapping("{orgId}")
    public ResponseEntity<?> upload(@PathVariable(name = "orgId") String orgId, MultipartHttpServletRequest request) throws IOException {
        return service.upload(orgId, request);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> view(@PathVariable(name = "id") String id) throws IOException {
        return service.view(id);
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<?> download(@PathVariable(name = "id") String id, HttpServletResponse response) throws IOException {
        return service.download(id, response);
    }
}

