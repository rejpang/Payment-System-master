package com.payment.collection.controller;

import com.payment.collection.controller.exception.NoTransactionFoundError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerAdviceController {

    @ExceptionHandler(NoTransactionFoundError.class)
    public ResponseEntity handleNoTransactionFound(){
        return new ResponseEntity("No Transaction !!!",HttpStatus.GONE);
    }
}
