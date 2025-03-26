package org.unal.renergy.infrastructure.inbound.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unal.renergy.application.find.CountryContinentFindUseCase;
import org.unal.renergy.domain.model.CountryContinent;

import java.util.List;

@RestController
@RequestMapping("/countries-continents")
@RequiredArgsConstructor
public class CountryContinentController {

    private final CountryContinentFindUseCase countryContinentFindUseCase;

    @GetMapping
    public List<CountryContinent> findAll() {
        return countryContinentFindUseCase.findAll();
    }
}
