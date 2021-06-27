package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.CardType;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebitCard extends AbstractCard {

    private CardType cardType;

    private AtmLimit atmLimit;

    private PosLimit posLimit;

    private boolean contactless;


}
