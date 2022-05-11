package com.example.mongotest.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.server.ResponseStatusException;

/**
 * Utility to validate dto objects
 *
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 03/05/2022
 */
@Slf4j
public class Dto {
    private Dto() {
        throw new IllegalStateException("Utility class");
    }

    public static void validate(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error(bindingResult.getAllErrors().toString());
            StringBuilder strBuilder = new StringBuilder();
            for (FieldError error : bindingResult.getFieldErrors()) {
                strBuilder.append(error.getDefaultMessage()).append(System.getProperty("line.separator"));
            }
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, strBuilder.toString());
        }
    }
}
