package uz.bakhromjon.medapp.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 01/10/22, Sat, 10:29
 **/
@RequiredArgsConstructor
@Getter
public enum Grade {
    EXCELLENT("EXCELLENT", 1),
    GOOD("GOOD", 2),
    SATISFACTORY("SATISFACTORY", 3),
    BAD("BAD", 4);

    private final String name;
    private final Integer code;
}
