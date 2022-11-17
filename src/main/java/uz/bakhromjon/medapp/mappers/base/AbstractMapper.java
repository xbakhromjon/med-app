package uz.bakhromjon.medapp.mappers.base;

import uz.bakhromjon.medapp.dtos.base.AbstractDTO;
import uz.bakhromjon.medapp.dtos.base.BaseDTO;
import uz.bakhromjon.medapp.entities.base.AbstractEntity;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
public interface AbstractMapper<E extends AbstractEntity, CD extends BaseDTO, UD extends AbstractDTO,
        GD extends AbstractDTO> {

    E toEntity(CD createDTO);

    E toEntity(UD updateDTO);


    GD toGetDTO(E entity);

    List<GD> toGetDTO(List<E> entity);
}
