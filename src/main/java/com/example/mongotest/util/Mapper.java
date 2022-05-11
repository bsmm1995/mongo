package com.example.mongotest.util;

import org.modelmapper.ModelMapper;

/**
 * Utility to map entities and data
 *
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
public class Mapper {
    private Mapper() {
        throw new IllegalStateException("Utility class");
    }

    public static ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
