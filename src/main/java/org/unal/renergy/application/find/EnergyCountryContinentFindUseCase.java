package org.unal.renergy.application.find;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.unal.renergy.domain.model.EnergyCountryContinent;
import org.unal.renergy.domain.repository.EnergyCountryContinentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EnergyCountryContinentFindUseCase {

    private final EnergyCountryContinentRepository repository;

    public List<EnergyCountryContinent> findAll() {
        return repository.findAll();
    }

    public Optional<EnergyCountryContinent> findById(Long id) {
        return repository.findById(id);
    }

    public List<EnergyCountryContinent> findByCountryContinentName(String countryContinentName) {
        return repository.findByCountryContinentName(countryContinentName);
    }

    public List<EnergyCountryContinent> findByYearAndCountryContinentName(int year, String countryContinentName) {
        return repository.findByYearAndCountryContinentName(year, countryContinentName);
    }

}
