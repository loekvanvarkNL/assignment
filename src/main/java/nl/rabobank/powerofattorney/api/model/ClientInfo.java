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

    private Long id;

    private List<AggregatedClientInfo> aggregatedClientInfo;

}