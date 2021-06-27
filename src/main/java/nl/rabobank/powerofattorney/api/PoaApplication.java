package nl.rabobank.powerofattorney.api;

import nl.rabobank.powerofattorney.api.model.Account;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PoaApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(PoaApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

//    @Bean
//    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//        return args -> {
//            Account account = restTemplate.getForObject(
//                    "http://localhost:8080/accounts", Account.class);
//
//        };
//    }

}
