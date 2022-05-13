package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.AuditMetadata;
import com.example.mongotest.domain.dto.ScopeDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("car_type_rating")
@Getter
@Setter
public class TypeRating extends AuditMetadata {
    private String description;

    @Field(value = "scopes")
    private List<ScopeDto> scopeList;

    @Field(value = "ratios_spread")
    @DBRef(lazy = true)
    private List<RatioSpread> ratioSpreadList;
}
