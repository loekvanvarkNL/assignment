package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    @NonNull
    private String owner;

    @NonNull
    private BigDecimal balance;

    @NonNull
    private LocalDate created;

    private LocalDate ended;

}
