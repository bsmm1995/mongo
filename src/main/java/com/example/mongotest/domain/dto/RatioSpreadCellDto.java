package com.example.mongotest.domain.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Data
public class RatioSpreadCellDto implements Serializable {
    private String row;
    private String column;
}
