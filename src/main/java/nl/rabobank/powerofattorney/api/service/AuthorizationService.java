package nl.rabobank.powerofattorney.api.service;


import nl.rabobank.powerofattorney.api.model.enums.Authorization;

import java.util.List;

public interface AuthorizationService {

        public abstract List<Authorization> getAuthorizations(Long id);

}
