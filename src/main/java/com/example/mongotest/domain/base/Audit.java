package com.example.mongotest.domain.base;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

/**
 * Class containing the generality of the audit fields. This super class is inherited from the entities.
 *
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Getter
@Setter
public class Audit {

    @CreatedDate
    private LocalDate createdDate;

    private LocalDate modifiedDate;

    private String createdBy;

    private String modifiedBy;

    private Boolean status = Boolean.TRUE;
}