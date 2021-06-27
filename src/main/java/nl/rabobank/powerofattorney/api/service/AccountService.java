package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.model.Account;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface AccountService {

    public abstract Account findById(Long id) throws EntityNotFoundException;

}
