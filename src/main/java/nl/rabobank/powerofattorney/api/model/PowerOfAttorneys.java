package nl.rabobank.powerofattorney.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class PowerOfAttorneys {

//    private List<RegisteredPowerOfAttorney> registeredPowerOfAttorneys;
    private List<String> listOfPoaIds;

}
