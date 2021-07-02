package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.model.PoaId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ClientInfoServiceImpl implements ClientInfoService {

    @Value("${stub.base.url}")
    private String baseUrl;

    @Value("${stub.clients.url}")
    private String clientsUrl;

    @Autowired
    private PoaService poaService;

    private final RestTemplate restTemplate;

    public ClientInfoServiceImpl(final RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }


    @Override
    public List<PoaId> getClientInfo(String name) {

        // find all clients by getting a list of all "poaId's"
        List<PoaId> poaIds = poaService.getAllPoaIds();


        return poaIds;
    }

}
