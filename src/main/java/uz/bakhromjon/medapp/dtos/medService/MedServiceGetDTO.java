package uz.bakhromjon.medapp.dtos.medService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.bakhromjon.medapp.entities.ServiceCost;

import java.util.List;

/**
 * @author : Bakhromjon Khasanboyev
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MedServiceGetDTO {
    private String title;
    private String content;
    private Boolean isAvailable = false;
    private List<ServiceCost> serviceCosts;
}
