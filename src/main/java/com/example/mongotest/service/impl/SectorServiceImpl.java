package com.example.mongotest.service.impl;

import com.example.mongotest.domain.entities.Sector;
import com.example.mongotest.repository.SectorRepository;
import com.example.mongotest.service.SectorService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
@Slf4j
public class SectorServiceImpl implements SectorService {

    private final SectorRepository sectorRepository;

    @Override
    public Sector getById(String id) {
        Optional<Sector> sectorOptional = sectorRepository.findById(id);
        if (sectorOptional.isEmpty()) {
            throwExceptionNotFound(id);
        }
        return sectorOptional.get();
    }

    @Override
    public List<Sector> getAll() {
        return sectorRepository.findAll();
    }

    @Override
    public Sector create(Sector data) {
        return sectorRepository.save(data);
    }

    @Override
    public Sector update(String id, Sector data) {
        Optional<Sector> sectorOptional = sectorRepository.findById(id);
        if (sectorOptional.isEmpty()) {
            throwExceptionNotFound(id);
        }
        return sectorRepository.save(data);
    }

    @Override
    public String deleteById(String id) {
        Optional<Sector> sectorOptional = sectorRepository.findById(id);
        if (sectorOptional.isEmpty()) {
            throwExceptionNotFound(id);
        }
        sectorRepository.deleteById(id);
        return id;
    }

    private void throwExceptionNotFound(String id) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Sector with id %s not found", id));
    }
}
