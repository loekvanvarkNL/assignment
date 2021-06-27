package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.CardType;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PoaCard {

    @Id
    @GeneratedValue
    private Long id;

    private CardType cardType;

    @ManyToOne
    @JoinColumn(name="poa_id")
    private Poa poa;

}
