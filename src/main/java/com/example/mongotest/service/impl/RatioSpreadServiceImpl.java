package com.example.mongotest.service.impl;

import com.example.mongotest.domain.base.AuditDto;
import com.example.mongotest.domain.dto.RatioSpreadDto;
import com.example.mongotest.domain.dto.outs.RatioSpreadOutDto;
import com.example.mongotest.domain.entities.RatioSpread;
import com.example.mongotest.repository.RatioSpreadRepository;
import com.example.mongotest.service.RatioSpreadService;
import com.example.mongotest.util.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@AllArgsConstructor
@Service
public class RatioSpreadServiceImpl implements RatioSpreadService {

    private final RatioSpreadRepository ratioSpreadRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<RatioSpreadOutDto> getAllRatios() {
        List<RatioSpreadOutDto> list = new ArrayList<>();
        for (RatioSpread element : this.ratioSpreadRepository.findAll()) {
            list.add(Mapper.modelMapper().map(element, RatioSpreadOutDto.class));
        }
        return list;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RatioSpreadOutDto getRatioById(String id) {
        Optional<RatioSpread> ratioOptional = this.ratioSpreadRepository.findById(id);
        if (ratioOptional.isEmpty()) {
            resourceNotFound(id);
        }
        return Mapper.modelMapper().map(ratioOptional.get(), RatioSpreadOutDto.class);
    }

    /**
     * {@inheritDoc}
     */
    @Transactional
    @Override
    public RatioSpreadOutDto createRatio(RatioSpreadDto data) {
        RatioSpread ratioSpread = Mapper.modelMapper().map(data, RatioSpread.class);
        return Mapper.modelMapper().typeMap(RatioSpread.class, RatioSpreadOutDto.class).map(this.ratioSpreadRepository.save(ratioSpread));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RatioSpreadOutDto updateRatio(String id, RatioSpreadDto data) {
        Optional<RatioSpread> ratioOptional = this.ratioSpreadRepository.findById(id);
        if (ratioOptional.isEmpty()) {
            resourceNotFound(id);
        }
        ratioOptional.get().setDescription(data.getDescription());
        return Mapper.modelMapper().map(this.ratioSpreadRepository.save(ratioOptional.get()), RatioSpreadOutDto.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String deleteRatio(String id) {
        Optional<RatioSpread> ratioOptional = this.ratioSpreadRepository.findById(id);
        if (ratioOptional.isEmpty()) {
            resourceNotFound(id);
        }
        ratioOptional.get().setStatus(Boolean.FALSE);
        this.ratioSpreadRepository.save(ratioOptional.get());
        return id;
    }

    private void resourceNotFound(String id) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("Ratio with id %s not found", id));
    }
}
