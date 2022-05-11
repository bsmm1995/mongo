package com.example.mongotest.controller;

import com.example.mongotest.domain.entities.Sector;
import com.example.mongotest.service.SectorService;
import com.example.mongotest.util.Dto;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

/**
 * API to manage sectors
 *
 * @author: Bladimir Minga <bsminga@pichincha.com>
 * @version: 10/05/2022
 */
@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping(value = "/sectors", produces = MediaType.APPLICATION_JSON_VALUE)
public class SectorController {

    private final SectorService sectorService;

    @GetMapping("/{id}")
    public ResponseEntity<Sector> getById(@PathVariable @NotBlank String id) {
        log.info("Endpoint to get sectors by id");
        return new ResponseEntity<>(sectorService.getById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Sector>> getAll() {
        log.info("Endpoint to get all sectors");
        return new ResponseEntity<>(sectorService.getAll(), HttpStatus.OK);
    }

    @PostMapping(headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity<Sector> create(@RequestBody @Valid Sector data, BindingResult bindingResult) {
        log.info("Endpoint to create a sector");
        Dto.validate(bindingResult);//The utility is invoked to validate the DTO
        return new ResponseEntity<>(this.sectorService.create(data), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}", headers = "Accept=application/json;charset=UTF-8")
    public ResponseEntity<Sector> update(@PathVariable @NotBlank String id, @RequestBody @Valid Sector data, BindingResult bindingResult) {
        log.info("Endpoint to update a sector");
        Dto.validate(bindingResult);//The utility is invoked to validate the DTO
        return new ResponseEntity<>(this.sectorService.update(id, data), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable @NotBlank String id) {
        log.info("Endpoint to delete a sector");
        return new ResponseEntity<>(this.sectorService.deleteById(id), HttpStatus.OK);
    }
}
