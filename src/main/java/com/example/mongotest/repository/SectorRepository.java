package com.example.mongotest.repository;

import com.example.mongotest.domain.entities.Sector;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectorRepository extends MongoRepository<Sector, String> {
    Sector findItemByDescription(String description);
}
