package com.example.mongotest.service.impl;

import com.example.mongotest.domain.dto.TypeRatingDto;
import com.example.mongotest.domain.dto.outs.TypeRatingOutDto;
import com.example.mongotest.domain.entities.TypeRating;
import com.example.mongotest.repository.TypeRatingRepository;
import com.example.mongotest.service.TypeRatingService;
import com.example.mongotest.util.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
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
public class TypeRatingServiceImpl implements TypeRatingService {

    private final TypeRatingRepository typeRatingRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<TypeRatingOutDto> getAllTypeRatings() {
        List<TypeRatingOutDto> list = new ArrayList<>();
        for (TypeRating element : this.typeRatingRepository.findAll()) {
            list.add(Mapper.modelMapper().map(element, TypeRatingOutDto.class));
        }
        return list;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeRatingOutDto getTypeRatingById(String id) {
        Optional<TypeRating> typeRatingOptional = this.typeRatingRepository.findById(id);
        if (typeRatingOptional.isEmpty()) {
            resourceNotFound(id);
        }
        return Mapper.modelMapper().map(typeRatingOptional.get(), TypeRatingOutDto.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeRatingOutDto createTypeRating(TypeRatingDto data) {
        if (data.getDescription().isEmpty()) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "A description of the Type of Rating is required.");
        }
        TypeRating typeRating = Mapper.modelMapper().map(data, TypeRating.class);
        return Mapper.modelMapper().map(this.typeRatingRepository.save(typeRating), TypeRatingOutDto.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TypeRatingOutDto updateTypeRating(String id, TypeRatingDto data) {
        Optional<TypeRating> typeRatingOptional = this.typeRatingRepository.findById(id);
        if (typeRatingOptional.isEmpty()) {
            resourceNotFound(id);
        }
        typeRatingOptional.get().setDescription(data.getDescription());
        return Mapper.modelMapper().map(this.typeRatingRepository.save(typeRatingOptional.get()), TypeRatingOutDto.class);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String deleteTypeRating(String id) {
        Optional<TypeRating> typeRatingOptional = this.typeRatingRepository.findById(id);
        if (typeRatingOptional.isEmpty()) {
            resourceNotFound(id);
        }
        typeRatingOptional.get().setStatus(Boolean.FALSE);
        this.typeRatingRepository.save(typeRatingOptional.get());
        return id;
    }

    private void resourceNotFound(String id) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("Type rating with id %s not found", id));
    }
}
