package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.CardType;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoaCard {

    private Long id;

    private CardType cardType;

    private Poa poa;

}
