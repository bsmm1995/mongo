package com.example.mongotest.controller;

import com.example.mongotest.domain.dto.RatioSpreadDto;
import com.example.mongotest.domain.dto.outs.RatioSpreadOutDto;
import com.example.mongotest.service.RatioSpreadService;
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
@RequestMapping(value = "/ratios-spread", produces = MediaType.APPLICATION_JSON_VALUE)
public class RatioSpreadController {

    private final RatioSpreadService ratioSpreadService;

    @GetMapping
    public ResponseEntity<List<RatioSpreadOutDto>> getAll() {
        log.info("Endpoint to get all ratios");
        return new ResponseEntity<>(ratioSpreadService.getAllRatios(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RatioSpreadOutDto> getById(@PathVariable String id) {
        log.info("Endpoint to get a ratio by ID");
        return new ResponseEntity<>(this.ratioSpreadService.getRatioById(id), HttpStatus.OK);
    }

    @PostMapping(headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity<RatioSpreadOutDto> create(@RequestBody RatioSpreadDto data) {
        log.info("Endpoint to create a ratio");
        return new ResponseEntity<>(this.ratioSpreadService.createRatio(data), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity<RatioSpreadOutDto> update(@PathVariable String id, @RequestBody RatioSpreadDto data) {
        log.info("Endpoint to update a ratio");
        return new ResponseEntity<>(this.ratioSpreadService.updateRatio(id, data), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}", headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity<String> delete(@PathVariable String id) {
        log.info("Endpoint to delete a ratio");
        return new ResponseEntity<>(this.ratioSpreadService.deleteRatio(id), HttpStatus.OK);
    }
}
