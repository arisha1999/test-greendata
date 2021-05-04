package ru.subbotina.testgreendata.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.subbotina.testgreendata.model.Deposit;
import ru.subbotina.testgreendata.repository.DepositRepository;

@Configuration
public class DepositConfiguration {
    private static final Logger log = LoggerFactory.getLogger(DepositConfiguration.class);
    @Bean
    CommandLineRunner initDatabaseDeposit(DepositRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Deposit()));
            log.info("Preloading " + repository.save(new Deposit()));
        };
    }
}
