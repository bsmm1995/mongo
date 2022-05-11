package com.example.mongotest.domain.dto;

import com.example.mongotest.domain.base.AuditDto;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class RatioSpreadDto extends AuditDto implements Serializable {
    private Long id;
    private Long typeRatingId;
    private String description;
    private Double percentagePeriod1;
    private Double percentagePeriod2;
    private Double percentagePeriod3;
    private Boolean isPercentage = Boolean.FALSE;
    private List<RatioSpreadEquationDto> ratioEquationList = new ArrayList<>(0);
    private List<RatioSpreadDetailDto> ratioDetailList = new ArrayList<>(0);
}
