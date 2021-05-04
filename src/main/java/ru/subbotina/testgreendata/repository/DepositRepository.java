package ru.subbotina.testgreendata.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.subbotina.testgreendata.model.Deposit;

public interface DepositRepository extends JpaRepository<Deposit,Long> {

}
