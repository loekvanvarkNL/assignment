package nl.rabobank.powerofattorney.api.controller;

import nl.rabobank.powerofattorney.api.service.AuthorizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("authorizations")
public class AuthorizationController {

    @Autowired
    private AuthorizationService authorizationService;

//    @RequestMapping(
//            value = "/{id}",
//            method = RequestMethod.GET,
//            produces = "application/json"
//    )
//    public ResponseEntity<ClientInfo> getClientInfo(Long id) {
//        return new ResponseEntity(authorizationService.getClientInfo(id), HttpStatus.OK);
//    }


//
//    @RequestMapping(
//            value = "/{owner}",
//            method = RequestMethod.GET,
//            produces = "application/json"
//    )
//    public ResponseEntity<Account> getAccountByOwner(String owner) {
//        return new ResponseEntity(accountService.findByOwner(owner), HttpStatus.OK);
//    }


}
