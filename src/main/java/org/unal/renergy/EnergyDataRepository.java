package org.unal.renergy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnergyDataRepository extends JpaRepository<EnergyDataEntity, Long> {

    @Query(value = "select energy.id as energy_id," +
            "country.id as id_country_continent," +
            "energy.date_year," +
            "energy.solar_capacity," +
            "energy.biofuels_production_twh," +
            "energy.electricity_solar_twh," +
            "energy.electricity_wind_twh," +
            "energy.electricity_hydro_twh," +
            "energy.renewables_percentage," +
            "energy.biofuels_productivity_twh," +
            "country.name as name," +
            "country.is_country," +
            "country.code as code" +
            " FROM energy_data energy join public.countries_continents country on country.id = energy.id_country_continent where country.code=?1", nativeQuery = true)
    List<EnergyDataDTO> findByCode(String code);

    @Query(value = "select energy.id as energy_id," +
            "country.id as id_country_continent," +
            "energy.date_year," +
            "energy.solar_capacity," +
            "energy.biofuels_production_twh," +
            "energy.electricity_solar_twh," +
            "energy.electricity_wind_twh," +
            "energy.electricity_hydro_twh," +
            "energy.renewables_percentage," +
            "energy.biofuels_productivity_twh," +
            "country.name as name," +
            "country.is_country," +
            "country.code as code" +
            " FROM energy_data energy join public.countries_continents country on country.id = energy.id_country_continent where date_year=?1 and name=?2", nativeQuery = true)
    EnergyDataDTO findByYearAndCode(int year, String countryName);
}
