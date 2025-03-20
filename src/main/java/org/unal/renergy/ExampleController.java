package org.unal.renergy;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExampleController {

    private final CountryContinentRepository repository;
    private final EnergyDataRepository energyDataRepository;

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    // Endpoint de acceso a las entidades
    @GetMapping("/entities")
    public List<CountryContinentEntity> entities() {
        return repository.findAll();
    }

    @GetMapping("/energy-data")
    public List<EnergyDataEntity> energyData() {
        return energyDataRepository.findAll();
    }
}
