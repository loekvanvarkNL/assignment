package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.model.CreditCard;
import nl.rabobank.powerofattorney.api.model.DebitCard;

import javax.persistence.EntityNotFoundException;

public interface CreditCardService {

    public abstract CreditCard findById(String id) throws EntityNotFoundException;

}
