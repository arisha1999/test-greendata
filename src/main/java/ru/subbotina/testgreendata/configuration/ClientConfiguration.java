package ru.subbotina.testgreendata.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.subbotina.testgreendata.model.Client;
import ru.subbotina.testgreendata.repository.ClientRepository;

@Configuration
public class ClientConfiguration {
    private static final Logger log = LoggerFactory.getLogger(ClientConfiguration.class);
    @Bean
    CommandLineRunner initDatabaseClient(ClientRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Client("Sberbank","Sber","Perm",1)));
            log.info("Preloading " + repository.save(new Client("Avito","Avt","Perm",2)));
        };
    }
}
