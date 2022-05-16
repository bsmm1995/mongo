package com.example.mongotest.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class ClassificationInformationDto implements Serializable {
    private String description;
    private List<RatioDto> ratioList = new ArrayList<>(0);
}
