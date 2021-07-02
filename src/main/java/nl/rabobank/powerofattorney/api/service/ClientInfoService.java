package nl.rabobank.powerofattorney.api.service;


import nl.rabobank.powerofattorney.api.model.PoaId;

import java.util.List;

public interface ClientInfoService {

        public abstract List<PoaId> getClientInfo(String name);

}
