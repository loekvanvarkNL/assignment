package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.model.Account;
import nl.rabobank.powerofattorney.api.repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import javax.persistence.EntityNotFoundException;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepo accountRepo;

    @Override
    public Account findById(Long id) throws HttpClientErrorException.NotFound {
        return accountRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(id.toString()));
            }

    @Override
    public Account findByOwner(String owner) throws HttpClientErrorException.NotFound {
        return accountRepo.findByOwner(owner)
                .orElseThrow(() -> new EntityNotFoundException(owner));
    }
}
