package com.example.mongotest.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class RatioSpreadDetailDto implements Serializable {
    private Integer score = 0;
    private Boolean isMinimumOrMaximum = Boolean.FALSE;
    private Integer minimum;
    private Integer maximum;
}
