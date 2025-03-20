package org.unal.renergy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "energy_data")
@Data
public class EnergyDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "date_year", nullable = false)
    private int year;

    private BigDecimal solar_capacity;

    private BigDecimal biofuels_productivity_twh;

    private BigDecimal electricity_solar_twh;

    private BigDecimal electricity_wind_twh;

    private BigDecimal electricity_hydro_twh;

    private BigDecimal renewables_percentage;

    @OneToOne
    @JoinColumn(name = "id_country_continent")
    private CountryContinentEntity countryContinent;
}
