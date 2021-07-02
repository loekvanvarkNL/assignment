package nl.rabobank.powerofattorney.api.service;

import lombok.extern.slf4j.Slf4j;
import nl.rabobank.powerofattorney.api.exception.NotFoundException;
import nl.rabobank.powerofattorney.api.model.DebitCard;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Component
public class DebitCardServiceImpl implements DebitCardService {

    @Value("${stub.base.url}")
    private String baseUrl;

    @Value("${stub.debitcards.url}")
    private String debitcardsUrl;

    private final RestTemplate restTemplate;

    public DebitCardServiceImpl(final RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public DebitCard findById(String id) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            log.info("[GET] Request: Debitcard on URL " + baseUrl + debitcardsUrl + "/" + id);
            DebitCard debitCard = restTemplate.getForObject(baseUrl + debitcardsUrl + "/" + id, DebitCard.class);
            if (debitCard != null) {
                log.info("[GET] Success: Debitcard: " + id);
                return debitCard;
            }
        } catch (Exception e) {
            String message = String.format("[GET] Error: retrieving Debitcard with id {%s} failed ", id);
            log.error(message);
            throw new NotFoundException(message);
        }
        return null;
    }

}
