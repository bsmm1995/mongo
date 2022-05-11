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
public class TypeRatingOutDto implements Serializable {
    private Long id;
    private Long sectorId;
    private String description;
    private List<ScopeOut> scopeList = new ArrayList<>(0);
    private List<RatioSpreadOutDto> ratioSpreadList = new ArrayList<>(0);
}

@Data
class ScopeOut implements Serializable {
    private Long id;
    private String description;
    private List<ClassificationInformationOut> classificationInformationList = new ArrayList<>(0);
}

@Data
class ClassificationInformationOut implements Serializable {
    private Long id;
    private String description;
    private List<RatioOut> ratioList = new ArrayList<>(0);
}

@Data
class RatioOut implements Serializable {
    private Long id;
    private String description;
    private List<RatioDetailOut> ratioDetailList = new ArrayList<>(0);
}

@Data
class RatioDetailOut implements Serializable {
    private Long id;
    private String description;
    private Integer score;
    private Boolean isMinimumOrMaximum;
    private Integer minimum;
    private Integer maximum;
}
