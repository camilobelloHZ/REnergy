package org.unal.renergy.infrastructure.outbound.database.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.unal.renergy.domain.model.EnergyCountryContinent;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "energy_countries_continents")
public class EnergyCountryContinentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_country_continent")
    private CountryContinentEntity countryContinent;

    @ManyToOne
    @JoinColumn(name = "id_energy")
    private EnergyDataEntity energyData;

    @Column(nullable = false, name = "date_year")
    private Integer year;

    private BigDecimal value;

    public EnergyCountryContinent toEnergyCountryContinent() {
        return EnergyCountryContinent.builder()
                .id(id)
                .countryContinent(countryContinent.toCountryContinent())
                .energyData(energyData.toEnergyData())
                .year(year)
                .value(value)
                .build();
    }
}
