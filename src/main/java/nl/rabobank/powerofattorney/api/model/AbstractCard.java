package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.CardStatus;
import org.springframework.lang.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractCard {

    @NonNull
    private String id;

    @NonNull
    private CardStatus cardStatus;

    @NonNull
    private int cardNumber;

    @NonNull
    private int sequenceNumber;

    @NonNull
    private String cardHolder;





}
