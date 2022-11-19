package uz.bakhromjon.medapp.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import uz.bakhromjon.medapp.exceptions.UniversalException;

import java.util.EnumSet;

/**
 * @author : Bakhromjon Khasanboyev
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

    public static String toString(Integer code) {
        EnumSet<Grade> enumSet = EnumSet.allOf(Grade.class);
        for (Grade grade : enumSet) {
            if (grade.getCode().equals(code)) return grade.getName();
        }
        // default
        return "EXCELLENT";
    }
}
