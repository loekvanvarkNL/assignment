package nl.rabobank.powerofattorney.api.controller;

import nl.rabobank.powerofattorney.api.model.DebitCard;
import nl.rabobank.powerofattorney.api.service.DebitCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("debitcards")
public class DebitCardController {

    @Autowired
    private DebitCardService debitCardService;

    @RequestMapping(
            value = "/{id}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<DebitCard> getAccountById(@PathVariable String id) {
        return new ResponseEntity(debitCardService.findById(id), HttpStatus.OK);
    }

}
