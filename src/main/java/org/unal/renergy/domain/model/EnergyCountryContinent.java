package org.unal.renergy.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class EnergyCountryContinent {
    private Long id;
    private CountryContinent countryContinent;
    private EnergyData energyData;
    private Integer year;
    private BigDecimal value;
}
