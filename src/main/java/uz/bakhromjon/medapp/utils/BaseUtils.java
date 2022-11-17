package uz.bakhromjon.medapp.utils;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import uz.bakhromjon.medapp.exceptions.UniversalException;

import java.util.UUID;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Component
public class BaseUtils {

    public Long strToLong(String id) {
        try {
            return Long.parseLong(id);
        } catch (Exception e) {
            throw new UniversalException("%s ID must be Long format", HttpStatus.BAD_REQUEST);
        }
    }
}
