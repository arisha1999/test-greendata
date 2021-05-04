package ru.subbotina.testgreendata.exceptions;

public class BankNotFoundException extends RuntimeException {
    public BankNotFoundException(Long id){
        super("Could not find bank " + id);
    }
}
