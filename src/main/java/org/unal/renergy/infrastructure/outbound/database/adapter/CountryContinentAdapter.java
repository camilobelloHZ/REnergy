package org.unal.renergy.infrastructure.outbound.database.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.unal.renergy.infrastructure.outbound.database.entities.CountryContinentEntity;
import org.unal.renergy.domain.model.CountryContinent;
import org.unal.renergy.domain.repository.CountryContinentRepository;
import org.unal.renergy.infrastructure.outbound.database.dataaccess.CountryContinentDataAccess;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CountryContinentAdapter implements CountryContinentRepository {

    private final CountryContinentDataAccess dataAccess;

    @Override
    public List<CountryContinent> findAll() {
        return dataAccess.findAll()
                .stream()
                .map(CountryContinentEntity::toCountryContinent)
                .toList();
    }

    // Falta por implementar
    @Override
    public Optional<CountryContinent> findById(Long id) {
        return Optional.empty();
    }

    // Falta por implementar
    @Override
    public Optional<CountryContinent> findByName(String name) {
        return Optional.empty();
    }
}
