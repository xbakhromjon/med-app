package uz.bakhromjon.medapp.dtos.note;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NoteCreateDTO {
    private String title;
    private String content;
    private Boolean isDeleted = false;
}
