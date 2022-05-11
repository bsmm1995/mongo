package com.example.mongotest.domain.dto.outs;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class RatioSpreadOutDto implements Serializable {
    private Long id;
    private Long typeRatingId;
    private String description;
    private Double percentagePeriod1;
    private Double percentagePeriod2;
    private Double percentagePeriod3;
    private List<RatioSpreadEquationOut> ratioEquationList = new ArrayList<>(0);
    private List<RatioSpreadDetailOut> ratioDetailList = new ArrayList<>(0);
}

@Data
class RatioSpreadEquationOut implements Serializable {
    private Long id;
    private Integer period;
    private String equation;
    private List<RatioSpreadCellOut> ratioCellEquationList = new ArrayList<>(0);
}

@Data
class RatioSpreadDetailOut implements Serializable {
    private Long id;
    private Integer score;
    private Boolean isPercentage;
    private Integer minimum;
    private Integer maximum;
}

@Data
class RatioSpreadCellOut implements Serializable {
    private Long id;
    private String row;
    private String column;
}
