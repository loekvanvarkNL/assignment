package nl.rabobank.powerofattorney.api.controller;

import nl.rabobank.powerofattorney.api.model.PoaId;
import nl.rabobank.powerofattorney.api.service.ClientInfoService;
import nl.rabobank.powerofattorney.api.service.PoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientInfoService clientInfoService;

    @Autowired
    private PoaService poaService;

    @RequestMapping(
            value = "/poa-ids/",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<List<PoaId>> getPoaIds() {
        return new ResponseEntity(poaService.getAllPoaIds(), HttpStatus.OK);
    }


    @RequestMapping(
            value = "/{name}",
            method = RequestMethod.GET,
            produces = "application/json"
    )
    public ResponseEntity<List<PoaId>> getClientInfo(@PathVariable String name) {
        return new ResponseEntity(poaService.getAllPoasByName(name), HttpStatus.OK);

    }

}
