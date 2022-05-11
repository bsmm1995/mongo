package com.example.mongotest.domain.dto.outs;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class SectorOutDto implements Serializable {
    private Long id;
    private String description;
    private List<TypeRatingOut> typeRatingList = new ArrayList<>(0);
}

@Data
class TypeRatingOut implements Serializable {
    private Long id;
    private String description;
}

