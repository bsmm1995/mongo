package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.Audit;
import com.example.mongotest.domain.dto.RatioSpreadDetailDto;
import com.example.mongotest.domain.dto.RatioSpreadEquationDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("car_ratios_spread")
@Getter
@Setter
public class RatioSpread extends Audit {
    @Id
    private String id;
    private String description;
    private Boolean isPercentage;
    private Double percentagePeriod1;
    private Double percentagePeriod2;
    private Double percentagePeriod3;
    private List<RatioSpreadEquationDto> ratioSpreadEquationList;
    private List<RatioSpreadDetailDto> ratioSpreadDetailList;
}
