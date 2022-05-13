package com.example.mongotest.service;

import com.example.mongotest.domain.dto.TypeRatingDto;
import com.example.mongotest.domain.dto.outs.TypeRatingOutDto;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
public interface TypeRatingService {

    /**
     * Method that returns all active TypeRatings
     *
     * @return List of active TypeRatings found
     */
    List<TypeRatingOutDto> getAllTypeRatings();

    /**
     * Obtain a TypeRating by its ID
     *
     * @param id ID of the TypeRating to be obtained
     * @return Active TypeRating found
     */
    TypeRatingOutDto getTypeRatingById(String id);

    /**
     * Save a new TypeRating
     *
     * @param data New object to create a TypeRating
     * @return New TypeRating created
     */
    TypeRatingOutDto createTypeRating(TypeRatingDto data);

    /**
     * Update a TypeRating by its ID
     *
     * @param id   ID of the TypeRating to be updated
     * @param data Data object for updating the TypeRating
     * @return TypeRating updated
     */
    TypeRatingOutDto updateTypeRating(String id, TypeRatingDto data);

    /**
     * Delete a TypeRating by its id
     *
     * @param id   ID of the TypeRating to be deleted
     * @param data Object containing information for auditing
     * @return ID of TypeRating removed
     */
    String deleteTypeRating(String id);
}
