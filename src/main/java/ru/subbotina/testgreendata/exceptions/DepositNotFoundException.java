package ru.subbotina.testgreendata.exceptions;

public class DepositNotFoundException extends RuntimeException {
    public DepositNotFoundException(Long id){
        super("Could not find deposit " + id);
    }
}
