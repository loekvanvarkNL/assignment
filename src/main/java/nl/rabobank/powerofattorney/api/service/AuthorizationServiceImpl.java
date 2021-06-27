package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.model.enums.Authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

    @Override
    public List<Authorization> getAuthorizations(Long id) {
        // TODO this is where the magic happens
        return null;
    }

}
