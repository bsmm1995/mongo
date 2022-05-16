package com.example.mongotest.configuration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@ControllerAdvice(annotations = RestController.class)
public class ExceptionConfig {

    @ExceptionHandler({ResponseStatusException.class})
    public ResponseEntity<Object> responseStatusException(Exception e) {
        log.error(e.getMessage());
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
    }
}
