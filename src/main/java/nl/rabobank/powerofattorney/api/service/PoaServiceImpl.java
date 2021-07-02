package nl.rabobank.powerofattorney.api.service;

import lombok.extern.slf4j.Slf4j;
import nl.rabobank.powerofattorney.api.exception.NotFoundException;
import nl.rabobank.powerofattorney.api.model.ClientInfo;
import nl.rabobank.powerofattorney.api.model.PoaId;
import nl.rabobank.powerofattorney.api.model.PowerOfAttorney;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
public class PoaServiceImpl implements PoaService {

    @Value("${stub.base.url}")
    private String baseUrl;

    @Value("${stub.powerofattorneys.url}")
    private String poasUrl;

    private final RestTemplate restTemplate;

    public PoaServiceImpl(final RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Override
    public List<PoaId> getAllPoaIds() {
        RestTemplate restTemplate = new RestTemplate();
        List<PoaId> poaIds = null;
        try {
            log.info("[GET] Request: List of POA Id's on URL " + baseUrl + poasUrl);
            poaIds = restTemplate.getForObject(baseUrl + poasUrl, List.class);
            if (poaIds != null) {
                log.info("[GET] Success: Power of Attorney Id's found");
                return poaIds.stream()
                        .collect(Collectors.toList());
            }
        } catch (Exception e) {
            String message = String.format("[GET] Error: retrieving Power of Attorney Id's failed");
            log.error(message);
            throw new NotFoundException(message);
        }
        log.info("[GET] Error: No Power of Attorneys found");
        return poaIds;
    }



    public List<PowerOfAttorney> getAllPoasByName(String name) {
        List<PowerOfAttorney> powerOfAttorneys = new ArrayList<>();
        List<PoaId> poaIds = this.getAllPoaIds();
        List<String> ids = poaIds.stream().map(PoaId::getId).collect(Collectors.toList());

        for (PoaId poaId : poaIds) {
            log.info("POA ID:: " + poaId.getId());
            try {
                log.info("[GET] Request: Power of Attorney on URL " + baseUrl + poasUrl + "/" + poaId.getId());
                PowerOfAttorney poa = restTemplate.getForObject(baseUrl + poasUrl + "/" + poaId.getId(), PowerOfAttorney.class);
                if (poa != null) {
                    log.info("[GET] Success: Power of Attorney found");
                    powerOfAttorneys.add(poa);
                    // TODO filter on parameter {name}
                }
            } catch (Exception e) {
                String message = String.format("[GET] Error: retrieving Power of Attorney's failed");
                log.error(message);
                throw new NotFoundException(message);
            }
            log.info("[GET] Error: No Power of Attorneys found");
            return powerOfAttorneys;
        }
        return null;
    }


    @Override
    public PoaId getPoaByPoaId(String poaId) throws NotFoundException {
        RestTemplate restTemplate = new RestTemplate();
        try {
            log.info("[GET] Request: Power of Attorney on URL " + baseUrl + poasUrl + "/" + poaId);
            PoaId poaIds = restTemplate.getForObject(baseUrl + poasUrl + "/" + poaId, PoaId.class);
            if (poaIds != null) {
                log.info("[GET] Success: Power of Attorney found");
                return poaIds;
            }
        } catch (Exception e) {
            String message = String.format("[GET] Error: retrieving Power of Attorney with id {%s} failed", poaId);
            log.error(message);
            throw new NotFoundException(message);
        }
        return null;
    }

    @Override
    public ClientInfo getClientInfoByPoaId(String poaId) throws NotFoundException {
        return null;
    }

}
