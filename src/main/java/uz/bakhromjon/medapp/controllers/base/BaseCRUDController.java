package uz.bakhromjon.medapp.controllers.base;

import org.springframework.http.ResponseEntity;
import uz.bakhromjon.medapp.dtos.base.AbstractDTO;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;


import java.io.Serializable;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public interface BaseCRUDController<GD extends AbstractDTO,
        CD extends BaseDTO, UD extends AbstractDTO, K extends Serializable> {


    ResponseEntity<GD> create(CD createDTO);

    ResponseEntity<GD> get(K id);

    ResponseEntity<GD> update(UD updateDTO);

    ResponseEntity<K> delete(K id);
}
