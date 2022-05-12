package com.example.mongotest.domain.entities;

import com.example.mongotest.domain.base.Audit;
import com.example.mongotest.domain.dto.HardFiltersDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Document("car_cases_detail")
@Getter
@Setter
public class CaseDetail extends Audit {
    @Id
    private String id;
    private String caseId;
    private List<HardFiltersDto> hardFilters;
    private TypeRating detail;
}
