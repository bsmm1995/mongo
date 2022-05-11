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
@Document("CAR_RATIO_SPREAD_EQUATIONS")
@Getter
@Setter
public class RatioSpreadEquation extends Audit {
    @Id
    private Long id;
    private Long ratioId;
    private Integer period;
    private String equation;
    private List<RatioSpreadCell> ratioSpreadCellList;
}
