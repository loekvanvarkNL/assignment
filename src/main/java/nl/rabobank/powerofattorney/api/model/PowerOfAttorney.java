package nl.rabobank.powerofattorney.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.Authorization;
import nl.rabobank.powerofattorney.api.model.enums.Direction;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PowerOfAttorney {

    private String id;

    private String grantor;

    private String grantee;

    private String account;

    private Direction direction;

    private List<Authorization> authorizations;

    private List<PoaCard> cards ;

}
