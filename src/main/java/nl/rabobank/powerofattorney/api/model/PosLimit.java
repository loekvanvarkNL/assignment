package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.periodUnit;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PosLimit {

    private BigDecimal limit;

    private periodUnit periodUnit;

}
