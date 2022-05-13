package com.example.mongotest.controller;

import com.example.mongotest.domain.dto.TypeRatingDto;
import com.example.mongotest.domain.dto.outs.TypeRatingOutDto;
import com.example.mongotest.service.TypeRatingService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 26/04/2022
 */
@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping(value = "/type-ratings", produces = MediaType.APPLICATION_JSON_VALUE)
public class TypeRatingController {

    private final TypeRatingService typeRatingService;

    @GetMapping
    public ResponseEntity<List<TypeRatingOutDto>> getAll() {
        log.info("Endpoint to get all TypeRatings");
        return new ResponseEntity<>(typeRatingService.getAllTypeRatings(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TypeRatingOutDto> getById(@PathVariable String id) {
        log.info("Endpoint to get a TypeRating by ID");
        return new ResponseEntity<>(this.typeRatingService.getTypeRatingById(id), HttpStatus.OK);
    }

    @PostMapping(headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity<TypeRatingOutDto> create(@RequestBody TypeRatingDto data) {
        log.info("Endpoint to create a TypeRating");
        return new ResponseEntity<>(this.typeRatingService.createTypeRating(data), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity<TypeRatingOutDto> update(@PathVariable String id, @RequestBody TypeRatingDto data) {
        log.info("Endpoint to update a TypeRating");
        return new ResponseEntity<>(this.typeRatingService.updateTypeRating(id, data), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}", headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity<String> delete(@PathVariable String id) {
        log.info("Endpoint to delete a TypeRating");
        return new ResponseEntity<>(this.typeRatingService.deleteTypeRating(id), HttpStatus.OK);
    }
}
