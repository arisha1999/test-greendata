package ru.subbotina.testgreendata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.subbotina.testgreendata.model.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
