package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.Audit;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("CAR_SECTORS")
@Getter
@Setter
public class Sector extends Audit {
    @Id
    @NotBlank
    private String id;

    @Field(value = "description")
    @NotBlank
    private String description;

    @DBRef
    private List<TypeRating> typeRatingList;
}
