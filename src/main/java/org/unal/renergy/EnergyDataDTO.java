package org.unal.renergy;

import java.math.BigDecimal;

public record EnergyDataDTO(
        Long energyId,
        Long idCountryContinent,
        Integer dateYear,
        BigDecimal solarCapacity,
        BigDecimal biofuelsProductionTWh,
        BigDecimal electricitySolarTWh,
        BigDecimal electricityWindTWh,
        BigDecimal electricityHydroTWh,
        BigDecimal renewablesPercentage,
        BigDecimal biofuelsProductivityTWh,
        String name,
        Boolean isCountry,
        String code
) {}
