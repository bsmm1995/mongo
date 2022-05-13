package com.example.mongotest.domain.dto;

import com.example.mongotest.domain.base.AuditMetadata;
import lombok.Data;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class RatioSpreadDto extends AuditMetadata {
    private String description;
    private Boolean isPercentage;
    private Double percentagePeriod1;
    private Double percentagePeriod2;
    private Double percentagePeriod3;
    private List<RatioSpreadEquationDto> ratioSpreadEquationList;
    private List<RatioSpreadDetailDto> ratioSpreadDetailList;
}
