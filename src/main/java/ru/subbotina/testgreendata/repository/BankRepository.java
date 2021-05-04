package ru.subbotina.testgreendata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.subbotina.testgreendata.model.Bank;

public interface BankRepository extends JpaRepository<Bank,Long> {

}
