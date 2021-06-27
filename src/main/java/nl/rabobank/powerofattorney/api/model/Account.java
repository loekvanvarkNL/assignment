package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;

    @NonNull
    private String owner;

    @NonNull
    private BigDecimal balance;

    @NonNull
    private LocalDate created;

    private LocalDate ended;

}