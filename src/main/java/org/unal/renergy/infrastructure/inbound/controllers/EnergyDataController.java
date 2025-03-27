package org.unal.renergy.infrastructure.inbound.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.unal.renergy.application.find.EnergyDataFindUseCase;
import org.unal.renergy.domain.model.EnergyData;

import java.util.List;

@RestController
@RequestMapping("/energy-data")
@RequiredArgsConstructor
public class EnergyDataController {

    private final EnergyDataFindUseCase energyDataFindUseCase;

    @GetMapping
    public List<EnergyData> getAll() {
        return energyDataFindUseCase.findAll();
    }

    @GetMapping("/{id}")
    public EnergyData getById(@PathVariable(name = "id") Long id) {
        return energyDataFindUseCase.findById(id);
    }
}
