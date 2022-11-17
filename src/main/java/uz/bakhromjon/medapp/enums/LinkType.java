package uz.bakhromjon.medapp.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author : Bakhromjon Khasanboyev
 * @username: @xbakhromjon
 * @since : 30/09/22, Fri, 16:22
 **/
@RequiredArgsConstructor
@Getter
public enum LinkType {
    TELEGRAM("TELEGRAM", 1),
    YOUTUBE("YOUTUBE", 2),
    INSTAGRAM("INSTAGRAM", 3);

    private final String name;
    private final Integer code;
}
