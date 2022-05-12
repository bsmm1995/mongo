package com.example.mongotest.domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class HardFiltersDto implements Serializable {
    private String description;
    private List<HardFiltersDetailDto> hardFiltersDetailDtoList;
}

@Data
class HardFiltersDetailDto implements Serializable {
    private String description;
    private Boolean apply = Boolean.FALSE;
    private Boolean endAnalysis = Boolean.FALSE;
}