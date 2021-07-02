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
 * A Client has an id, and might have multiple products/authorizations in the form of AggregatedClientInfo
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientInfo {

    private String id; // userId

    private List<AggregatedClientInfo> aggregatedClientInfo;

}
