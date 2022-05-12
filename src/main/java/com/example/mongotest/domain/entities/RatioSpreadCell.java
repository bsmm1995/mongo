package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.Audit;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("CAR_RATIO_SPREAD_CELL")
@Getter
@Setter
public class RatioSpreadCell extends Audit {
    @Id
    @NotBlank
    private String id;
    private String ratioEquationId;
    private String row;
    private String column;
}
