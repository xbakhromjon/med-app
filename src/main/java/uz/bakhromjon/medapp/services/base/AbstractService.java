package uz.bakhromjon.medapp.services.base;

import lombok.RequiredArgsConstructor;
import uz.bakhromjon.medapp.mappers.base.BaseMapper;
import uz.bakhromjon.medapp.repositories.base.BaseRepository;
import uz.bakhromjon.medapp.validations.base.BaseValidator;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RequiredArgsConstructor
public abstract class AbstractService<R extends BaseRepository, M extends BaseMapper, V extends BaseValidator> implements BaseService {
    public final R repository;
    public final M mapper;
    public final V validator;
}
