package nl.rabobank.powerofattorney.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.CardType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties
public class PoaCard {

    private String id;

    private CardType cardType;

}
