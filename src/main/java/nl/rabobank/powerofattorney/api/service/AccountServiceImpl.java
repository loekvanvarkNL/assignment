package nl.rabobank.powerofattorney.api.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccountServiceImpl implements AccountService {

    @Value("${stub.base.url}")
    private String baseUrl;

    @Value("${stub.accounts.url}")
    private String accountsUrl;

    private final RestTemplate restTemplate;

    public AccountServiceImpl(final RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }



}
