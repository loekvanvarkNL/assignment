package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.model.enums.Authorization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

//    @Autowired
//    private ClientInfo clientInfo;

    @Override
    public List<Authorization> getAuthorizations(Long id) {
        return null;
    }
//
//    @Override
//    public ClientInfo getClientInfo(Long id) {
//        return null;
//    }
}
