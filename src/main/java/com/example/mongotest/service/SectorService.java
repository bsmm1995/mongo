package com.example.mongotest.service;

import com.example.mongotest.domain.entities.Sector;

import java.util.List;

public interface SectorService {
    Sector getById(String id);

    List<Sector> getAll();

    Sector create(Sector data);

    Sector update(String id, Sector data);

    String deleteById(String id);
}
