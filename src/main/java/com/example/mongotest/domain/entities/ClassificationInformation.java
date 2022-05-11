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
@Document("CAR_CLASSIFICATION_INFORMATION")
@Getter
@Setter
public class ClassificationInformation extends Audit {
    @Id
    private Long id;
    private Long scopeId;
    private String description;
    private List<Ratio> ratioList;
}
