package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.exception.NotFoundException;
import nl.rabobank.powerofattorney.api.model.DebitCard;

public interface DebitCardService {

    public abstract DebitCard findById(String id) throws NotFoundException;

}
