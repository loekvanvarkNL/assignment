package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.exception.NotFoundException;
import nl.rabobank.powerofattorney.api.model.ClientInfo;
import nl.rabobank.powerofattorney.api.model.PoaId;
import nl.rabobank.powerofattorney.api.model.PowerOfAttorney;

import javax.persistence.EntityNotFoundException;
import java.util.List;

public interface PoaService {

    /**
     * Get all existing Power of Attorney Id's
     *
     * @return List<String> of poaIds
     */
    public abstract List<PoaId> getAllPoaIds();

//    public abstract List<PowerOfAttorney> getAllPoas();

    public abstract List<PowerOfAttorney> getAllPoasByName(String name);

    /**
     * Get the Poa object by its poaId.
     *
     * @param poaId poaId.
     * @return Power of Attorney (Poa) object
     */
    public abstract PoaId getPoaByPoaId(String poaId) throws NotFoundException;


    /**
     * Get the ClientInfo object by its poaId.
     *
     * @param poaId poaId.
     * @return Clientinfo
     */
    public abstract ClientInfo getClientInfoByPoaId(String poaId) throws EntityNotFoundException;



//    public abstract Account findByOwner(String owner) throws EntityNotFoundException;
//
//    public abstract Set<Account> findByOwner(String owner) throws EntityNotFoundException;


}
