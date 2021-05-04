package ru.subbotina.testgreendata.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.subbotina.testgreendata.exceptions.BankNotFoundException;
import ru.subbotina.testgreendata.model.Bank;
import ru.subbotina.testgreendata.repository.BankRepository;

import java.util.List;

@RestController
public class BankController {
    private final BankRepository bankRepository;

    public BankController(BankRepository bankRepository){
        this.bankRepository = bankRepository;
    }

    @GetMapping("/banks")
    List<Bank> all() {
        return bankRepository.findAll();
    }

    @PostMapping("/banks")
    Bank newBank(@RequestBody Bank newBank) {
        return bankRepository.save(newBank);
    }

    @GetMapping("/banks/{id}")
    Bank one(@PathVariable Long id) {
        return bankRepository.findById(id)
                .orElseThrow(() -> new BankNotFoundException(id));
    }

    @PutMapping("/banks/{id}")
    Bank replaceBank(@RequestBody Bank newBank, @PathVariable Long id) {
        return bankRepository.findById(id)
                .map(bank -> {
                    bank.setName(newBank.getName());
                    bank.setBIC(newBank.getBIC());
                    return bankRepository.save(bank);
                })
                .orElseGet(() -> {
                    newBank.setId(id);
                    return bankRepository.save(newBank);
                });
    }

    @DeleteMapping("/banks/{id}")
    void deleteBank(@PathVariable Long id) {
        bankRepository.deleteById(id);
    }
}
