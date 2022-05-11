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
public class TypeRatingDto extends AuditDto implements Serializable {
    private Long id;
    private Long sectorId;
    private String description;
    private List<ScopeDto> scopeList = new ArrayList<>(0);
    private List<RatioSpreadDto> ratioSpreadList = new ArrayList<>(0);
}
