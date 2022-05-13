package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.AuditMetadata;
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
@Document("car_sectors")
@Getter
@Setter
public class Sector extends AuditMetadata {
    private String description;

    @Field(value = "types_rating")
    @DBRef(lazy = true)
    private List<TypeRating> typeRatingList;
}
