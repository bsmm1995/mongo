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
@Document("CAR_RATIOS")
@Getter
@Setter
public class Ratio extends Audit {
    @Id
    private Long id;
    private Long classificationInformationId;
    private String description;
    private List<RatioDetail> ratioDetailList;
}
