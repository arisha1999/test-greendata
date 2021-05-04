package ru.subbotina.testgreendata.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.subbotina.testgreendata.exceptions.BankNotFoundException;
import ru.subbotina.testgreendata.exceptions.ClientNotFoundException;
import ru.subbotina.testgreendata.exceptions.DepositNotFoundException;

@ControllerAdvice
public class ExceptionHelper {
    @ResponseBody
    @ExceptionHandler(BankNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ClientNotFoundAdvice(BankNotFoundException ex){
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(ClientNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ClientNotFoundAdvice(ClientNotFoundException ex){
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(DepositNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ClientNotFoundAdvice(DepositNotFoundException ex){
        return ex.getMessage();
    }
}
