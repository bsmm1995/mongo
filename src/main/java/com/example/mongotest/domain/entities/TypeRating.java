package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.Audit;
import com.example.mongotest.domain.dto.ScopeDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("car_type_rating")
@Getter
@Setter
public class TypeRating extends Audit {
    @Id
    private String id;

    private String description;

    private List<ScopeDto> scopeList;

    @DBRef(lazy = true)
    private List<RatioSpread> ratioSpreadList;
}
