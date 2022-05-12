package com.example.mongotest.domain.dto;

import com.example.mongotest.domain.base.AuditDto;
import lombok.Data;

import java.io.Serializable;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class RatioSpreadCellDto extends AuditDto implements Serializable {
    private String row;
    private String column;
}
