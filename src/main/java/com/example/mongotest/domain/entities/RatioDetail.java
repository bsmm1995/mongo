package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.Audit;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("CAR_RATIO_DETAILS")
@Getter
@Setter
public class RatioDetail extends Audit {
    @Id
    private Long id;
    private Long ratioId;
    private String description;
    private Integer score;
    private Boolean isMinimumOrMaximum;
    private Integer minimum;
    private Integer maximum;
}
