package nl.rabobank.powerofattorney.api.service;

import nl.rabobank.powerofattorney.api.model.Account;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class AccountServiceImpl implements AccountService {

    @Value("${poa.accounts.url}")
    private String url;

    private final RestTemplate restTemplate;

    public AccountServiceImpl(final RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public Account findById(Long id) throws HttpClientErrorException.NotFound {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url + id.toString(), Account.class);
    }

}
