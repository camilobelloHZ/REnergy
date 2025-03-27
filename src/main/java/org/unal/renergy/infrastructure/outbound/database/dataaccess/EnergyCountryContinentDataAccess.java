package org.unal.renergy.infrastructure.outbound.database.dataaccess;


import org.springframework.data.jpa.repository.JpaRepository;
import org.unal.renergy.infrastructure.outbound.database.entities.EnergyCountryContinentEntity;

import java.util.List;

public interface EnergyCountryContinentDataAccess extends JpaRepository<EnergyCountryContinentEntity, Long> {
    List<EnergyCountryContinentEntity> findByCountryContinent_Name(String countryContinentName);
    List<EnergyCountryContinentEntity> findByYearAndCountryContinent_Name(int year, String countryContinentName);
}
