package com.example.mongotest.repository;

import com.example.mongotest.domain.entities.Sector;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SectorRepository extends MongoRepository<Sector, String> {
    Optional<Sector> findByDescriptionAndStatus(String description, Boolean status);

    Optional<Sector> findByIdAndStatus(String id, Boolean status);

    List<Sector> findAllByStatus(Boolean status);
}
