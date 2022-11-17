package uz.bakhromjon.medapp.dtos.vacancy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.entities.Candidate;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class VacancyUpdateDTO {
    private String position;
    private Integer employment;
    private String content;
    private List<Candidate> candidates;
}
