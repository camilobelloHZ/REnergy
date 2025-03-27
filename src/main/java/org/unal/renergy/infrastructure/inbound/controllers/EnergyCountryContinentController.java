package org.unal.renergy.infrastructure.inbound.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unal.renergy.application.find.EnergyCountryContinentFindUseCase;
import org.unal.renergy.domain.model.EnergyCountryContinent;

import java.util.List;

@RestController
@RequestMapping("energy-country-continent")
@RequiredArgsConstructor
public class EnergyCountryContinentController {

    private final EnergyCountryContinentFindUseCase findUseCase;

    @GetMapping
    public List<EnergyCountryContinent> getAll() {
        return findUseCase.findAll();
    }

    @GetMapping("/country-continent/{countryContinentName}")
    public List<EnergyCountryContinent> findByCountryContinentName(@PathVariable(name = "countryContinentName") String countryContinentName) {
        return findUseCase.findByCountryContinentName(countryContinentName);
    }

    @GetMapping("/{year}/country-continent/{countryContinentName}")
    public List<EnergyCountryContinent> getByYearAndCountryContinentName(@PathVariable(name = "year") Integer year,
                                                                         @PathVariable(name = "countryContinentName") String countryContinentName) {
        return findUseCase.findByYearAndCountryContinentName(year, countryContinentName);
    }
}
