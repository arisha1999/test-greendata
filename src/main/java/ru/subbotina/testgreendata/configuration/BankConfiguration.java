package ru.subbotina.testgreendata.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.subbotina.testgreendata.model.Bank;
import ru.subbotina.testgreendata.repository.BankRepository;

@Configuration
public class BankConfiguration {
    private static final Logger log = LoggerFactory.getLogger(BankConfiguration.class);

    @Bean
    CommandLineRunner initDatabaseBank(BankRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Bank("Sberbank","123")));
            log.info("Preloading " + repository.save(new Bank("Avito","124")));
        };
    }
}
