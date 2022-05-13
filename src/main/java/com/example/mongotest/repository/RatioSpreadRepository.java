package com.example.mongotest.repository;

import com.example.mongotest.domain.entities.RatioSpread;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
public interface RatioSpreadRepository extends MongoRepository<RatioSpread, String> {
}
