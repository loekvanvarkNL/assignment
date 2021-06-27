package nl.rabobank.powerofattorney.api.controller;

import nl.rabobank.powerofattorney.api.model.Account;
import nl.rabobank.powerofattorney.api.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<Account> getAccountById(Long id) {
        return new ResponseEntity(accountService.findById(id), HttpStatus.OK);
    }

    @RequestMapping(
            value = "/{owner}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<Account> getAccountByOwner(String owner) {
        return new ResponseEntity(accountService.findByOwner(owner), HttpStatus.OK);
    }


}
