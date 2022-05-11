package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.Audit;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("CAR_RATIOS_SPREAD")
@Getter
@Setter
public class RatioSpread extends Audit {
    @Id
    private Long id;
    private Long typeRatingId;
    private String description;
    private Boolean isPercentage;
    private Double percentagePeriod1;
    private Double percentagePeriod2;
    private Double percentagePeriod3;
    private List<RatioSpreadEquation> ratioSpreadEquationList;
    private List<RatioSpreadDetail> ratioSpreadDetailList;
}
