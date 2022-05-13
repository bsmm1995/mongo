package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.AuditMetadata;
import com.example.mongotest.domain.dto.HardFiltersDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("car_cases_detail")
@Getter
@Setter
public class CaseDetail extends AuditMetadata {
    @Field(value = "case_id")
    private String caseId;

    @Field(value = "hard_filters")
    private List<HardFiltersDto> hardFilters;
    private TypeRating detail;
}
