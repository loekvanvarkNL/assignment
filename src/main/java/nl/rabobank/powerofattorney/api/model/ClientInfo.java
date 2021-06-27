package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.Authorization;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * Information on products and authorizations of a client
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientInfo {

    @NonNull
    private Long id;

//    private List<DebitCard> debitCards;
//
//    private List<CreditCard> creditCards;
//
//    private List<Authorization> authorizations;
//
//    private List<String> grantors;
//
//    private List<String> grantees;

}