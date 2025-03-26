package org.unal.renergy.domain.repository;

import org.unal.renergy.domain.model.CountryContinent;

import java.util.List;
import java.util.Optional;

public interface CountryContinentRepository {
    List<CountryContinent> findAll();
    Optional<CountryContinent> findById(Long id);
    Optional<CountryContinent> findByName(String name);
}
