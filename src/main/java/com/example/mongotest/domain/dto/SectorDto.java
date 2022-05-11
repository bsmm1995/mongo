package com.example.mongotest.domain.dto;

import com.example.mongotest.domain.base.AuditDto;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class SectorDto extends AuditDto implements Serializable {
    private Long id;

    @NotBlank(message = "The description field is required NotBlank")
    @NotEmpty(message = "The description field is required NotEmpty")
    @NotNull(message = "The description field cannot be null")
    private String description;

    private List<TypeRatingDto> typeRatingList = new ArrayList<>(0);
}
