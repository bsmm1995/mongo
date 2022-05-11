package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.Audit;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("CAR_TYPE_RATINGS")
@Getter
@Setter
public class TypeRating extends Audit {
    @Id
    private Long id;
    private Long sectorId;
    private String description;
    private List<Scope> scopeList;
    private List<RatioSpread> ratioSpreadList;
}
