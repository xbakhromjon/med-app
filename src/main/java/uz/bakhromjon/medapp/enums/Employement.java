package uz.bakhromjon.medapp.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 01/10/22, Sat, 13:10
 **/
@RequiredArgsConstructor
@Getter
public enum Employement {
    FULL_TIME("FULL_TIME", 1),
    PART_TIME("PART_TIME", 2);

    private final String name;
    private final Integer code;
}
