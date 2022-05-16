package com.example.mongotest.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class RatioSpreadDto implements Serializable {
    private String description;
    private Boolean isPercentage;
    private List<PercentageDto> percentageList;
    private List<RatioSpreadEquationDto> ratioSpreadEquationList;
    private List<RatioSpreadDetailDto> ratioSpreadDetailList;
}
