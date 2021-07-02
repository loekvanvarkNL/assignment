package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.PeriodUnit;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AtmLimit {

    private BigDecimal limit;

    private PeriodUnit periodUnit;
}
