package com.example.mongotest.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class TypeRatingRatioOutDto implements Serializable {
    private Long id;
    private Long ratioId;
    private Long typeRatingId;
    private Double percentagePeriod1;
    private Double percentagePeriod2;
    private Double percentagePeriod3;
}
