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
public class RatioSpreadEquationDto extends AuditDto implements Serializable {
    private Integer period;
    private String equation;
    private List<RatioSpreadCellDto> ratioSpreadCellList = new ArrayList<>(0);
}
