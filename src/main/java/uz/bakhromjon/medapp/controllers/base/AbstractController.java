package uz.bakhromjon.medapp.controllers.base;

import lombok.RequiredArgsConstructor;
import uz.bakhromjon.medapp.services.base.BaseService;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@RequiredArgsConstructor
public abstract class AbstractController<S extends BaseService> implements BaseController {
    public final S service;
}
