package org.unal.renergy.domain.repository;

import org.unal.renergy.domain.model.EnergyCountryContinent;

import java.util.List;
import java.util.Optional;

public interface EnergyCountryContinentRepository {
    List<EnergyCountryContinent> findAll();
    Optional<EnergyCountryContinent> findById(Long id);
    List<EnergyCountryContinent> findByCountryContinentName(String countryContinentName);
}
