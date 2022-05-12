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
public class ClassificationInformationDto extends AuditDto implements Serializable {
    private String description;
    private List<RatioDto> ratioList = new ArrayList<>(0);
}
