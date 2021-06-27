package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.model.Account;
import org.springframework.web.client.HttpClientErrorException;

import javax.persistence.EntityNotFoundException;

public interface AccountService {

    public abstract Account findById(Long id) throws EntityNotFoundException;

    public abstract Account findByOwner(String owner) throws EntityNotFoundException;



}
