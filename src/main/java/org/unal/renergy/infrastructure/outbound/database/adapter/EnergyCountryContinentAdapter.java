package org.unal.renergy.infrastructure.outbound.database.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.unal.renergy.domain.model.EnergyCountryContinent;
import org.unal.renergy.domain.repository.EnergyCountryContinentRepository;
import org.unal.renergy.infrastructure.outbound.database.dataaccess.EnergyCountryContinentDataAccess;
import org.unal.renergy.infrastructure.outbound.database.entities.EnergyCountryContinentEntity;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EnergyCountryContinentAdapter implements EnergyCountryContinentRepository {

    private final EnergyCountryContinentDataAccess dataAccess;

    @Override
    public List<EnergyCountryContinent> findAll() {
        return dataAccess.findAll()
                .stream()
                .map(EnergyCountryContinentEntity::toEnergyCountryContinent)
                .toList();
    }

    @Override
    public Optional<EnergyCountryContinent> findById(Long id) {
        return dataAccess.findById(id)
                .stream()
                .map(EnergyCountryContinentEntity::toEnergyCountryContinent)
                .findAny();
    }

    @Override
    public List<EnergyCountryContinent> findByCountryContinentName(String countryContinentName) {
        return dataAccess.findByCountryContinent_Name(countryContinentName)
                .stream()
                .map(EnergyCountryContinentEntity::toEnergyCountryContinent)
                .toList();
    }
}
