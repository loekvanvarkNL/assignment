package nl.rabobank.powerofattorney.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nl.rabobank.powerofattorney.api.model.enums.Authorization;
import nl.rabobank.powerofattorney.api.model.enums.Direction;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Poa {

    @Id
    @GeneratedValue
    private Long id;

    private String grantor;

    private String grantee;

    private Account account;

    private Direction direction;

    @ElementCollection
    @Enumerated
    private Set<Authorization> authorizations;

    @OneToMany(mappedBy = "poa")
    private Set<PoaCard> cards ;


}
