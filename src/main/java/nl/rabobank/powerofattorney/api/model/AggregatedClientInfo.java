package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Class represents the products and authorizations (cards, grantors/grantees etc.) for a client
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AggregatedClientInfo {

    // TODO

    // Power of Attorneys


    // Accounts

    // Debit cards
    private List<DebitCard> debitcards;

    // Creditcards

    // Grantees: given authorizations (for credit/debit, view/pay) to other clients by this client

    // Grantors given authorizations (credit/debit, view/pay) by other clients to this client

}
