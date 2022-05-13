package com.example.mongotest.domain.dto;

import com.example.mongotest.domain.base.AuditMetadata;
import com.example.mongotest.domain.entities.RatioSpread;
import lombok.Data;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class TypeRatingDto extends AuditMetadata {
    private String description;
    private List<ScopeDto> scopeList;
    private List<RatioSpread> ratioSpreadList;
}
