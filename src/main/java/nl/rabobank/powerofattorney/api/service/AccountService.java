package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.model.Account;

import javax.persistence.EntityNotFoundException;

public interface AccountService {

    public abstract Account findById(Long id) throws EntityNotFoundException;

}
