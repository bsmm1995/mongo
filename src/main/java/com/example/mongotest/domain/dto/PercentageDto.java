package com.example.mongotest.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class PercentageDto implements Serializable {
    private Integer period;
    private Double value;
}
