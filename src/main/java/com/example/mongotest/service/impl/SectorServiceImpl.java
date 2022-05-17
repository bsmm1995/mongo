package com.example.mongotest.service.impl;

import com.example.mongotest.domain.dto.SectorDto;
import com.example.mongotest.domain.entities.Sector;
import com.example.mongotest.repository.SectorRepository;
import com.example.mongotest.service.SectorService;
import com.example.mongotest.util.Mapper;
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
        Optional<Sector> sectorOptional = sectorRepository.findByIdAndStatus(id, Boolean.TRUE);
        if (sectorOptional.isEmpty()) {
            throwExceptionNotFound(id);
        }
        return sectorOptional.get();
    }

    @Override
    public List<Sector> getAll() {//6282d604a1f7a96a539473c2
        return sectorRepository.findAllByStatus(Boolean.TRUE);
    }

    @Override
    public SectorDto create(SectorDto data) {
        Optional<Sector> sectorOptional = sectorRepository.findByDescriptionAndStatus(data.getDescription(), Boolean.TRUE);
        if (sectorOptional.isPresent()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("Sector %s is already registered", data.getDescription()));
        }
        Sector sector = Mapper.modelMapper().map(data, Sector.class);
        return Mapper.modelMapper().map(sectorRepository.insert(sector), SectorDto.class);
    }

    @Override
    public SectorDto update(String id, SectorDto data) {
        Optional<Sector> sectorOptional = sectorRepository.findByIdAndStatus(id, Boolean.TRUE);
        if (sectorOptional.isEmpty()) {
            throwExceptionNotFound(id);
        }
        sectorOptional.get().setDescription(data.getDescription());
        return Mapper.modelMapper().map(sectorRepository.save(sectorOptional.get()), SectorDto.class);
    }

    @Override
    public String deleteById(String id) {
        Optional<Sector> sectorOptional = sectorRepository.findByIdAndStatus(id, Boolean.TRUE);
        if (sectorOptional.isEmpty()) {
            throwExceptionNotFound(id);
        }
        sectorOptional.get().setStatus(Boolean.FALSE);
        sectorRepository.save(sectorOptional.get());
        return id;
    }

    private void throwExceptionNotFound(String id) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Sector with id %s not found", id));
    }
}
