package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.AuditMetadata;
import com.example.mongotest.domain.dto.PercentageDto;
import com.example.mongotest.domain.dto.RatioSpreadDetailDto;
import com.example.mongotest.domain.dto.RatioSpreadEquationDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("car_ratios_spread")
@Getter
@Setter
public class RatioSpread extends AuditMetadata {
    private String description;

    @Field(value = "is_percentage")
    private Boolean isPercentage;

    @Field(value = "percentages")
    private List<PercentageDto> percentageList;

    @Field(value = "ratio_spread_equations")
    private List<RatioSpreadEquationDto> ratioSpreadEquationList;

    @Field(value = "ratio_spread_details")
    private List<RatioSpreadDetailDto> ratioSpreadDetailList;
}
