package com.example.mongotest.service;

import com.example.mongotest.domain.base.AuditDto;
import com.example.mongotest.domain.dto.RatioSpreadDto;
import com.example.mongotest.domain.dto.outs.RatioSpreadOutDto;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
public interface RatioSpreadService {

    /**
     * Method that returns all active ratios
     *
     * @return List of active ratios found
     */
    List<RatioSpreadOutDto> getAllRatios();

    /**
     * Obtain a ratio by its ID
     *
     * @param id ID of the ratio to be obtained
     * @return Active ratio found
     */
    RatioSpreadOutDto getRatioById(String id);

    /**
     * Save a new ratio
     *
     * @param data New object to create a ratio
     * @return New ratio created
     */
    RatioSpreadOutDto createRatio(RatioSpreadDto data);

    /**
     * Update a ratio by its ID
     *
     * @param id   ID of the Ratio to be updated
     * @param data Data object for updating the ratio
     * @return Ratio updated
     */
    RatioSpreadOutDto updateRatio(String id, RatioSpreadDto data);

    /**
     * Delete a ratio by its id
     *
     * @param id   ID of the ratio to be deleted
     * @param data Object containing information for auditing
     * @return ID of ratio removed
     */
    String deleteRatio(String id);
}
