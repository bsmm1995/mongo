package com.example.mongotest.domain.base;

import lombok.Getter;
import lombok.Setter;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@Getter
@Setter
public class AuditDto {
    private String user;
    private String ip;
}