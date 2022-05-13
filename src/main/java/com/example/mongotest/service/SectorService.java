package com.example.mongotest.service;

import com.example.mongotest.domain.dto.SectorDto;
import com.example.mongotest.domain.entities.Sector;

import java.util.List;

public interface SectorService {
    Sector getById(String id);

    List<Sector> getAll();

    SectorDto create(SectorDto data);

    SectorDto update(String id, SectorDto data);

    String deleteById(String id);
}
