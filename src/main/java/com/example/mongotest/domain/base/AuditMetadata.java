package com.example.mongotest.domain.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDateTime;

/**
 * Class containing the generality of the audit fields. This super class is inherited from the entities.
 *
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Getter
@Setter
public abstract class AuditMetadata {
    @MongoId
    private String id;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

    @CreatedBy
    private String createdByUser;

    @LastModifiedBy
    private String modifiedByUser;

    @JsonIgnore
    private Boolean status = Boolean.TRUE;
}