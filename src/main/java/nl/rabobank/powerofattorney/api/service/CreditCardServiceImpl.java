package nl.rabobank.powerofattorney.api.service;

import lombok.extern.slf4j.Slf4j;
import nl.rabobank.powerofattorney.api.exception.NotFoundException;
import nl.rabobank.powerofattorney.api.model.CreditCard;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class CreditCardServiceImpl implements CreditCardService {

    @Value("${stub.base.url}")
    private String baseUrl;

    @Value("${stub.creditcards.url}")
    private String creditcardsUrl;

    private final RestTemplate restTemplate;

    public CreditCardServiceImpl(final RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public CreditCard findById(String id) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            log.info("[GET] Request: Creditcard on URL " + baseUrl + creditcardsUrl + "/" + id);
            CreditCard creditCard = restTemplate.getForObject(baseUrl + creditcardsUrl + "/" + id, CreditCard.class);
            if (creditCard != null) {
                log.info("[GET] Success: Creditcard: " + id);
                return creditCard;
            }
        } catch (Exception e) {
            String message = String.format("[GET] Error: retrieving Creditcard with id {%s} failed ", id);
            log.error(message);
            throw new NotFoundException(message);
        }
        return null;
    }

}
