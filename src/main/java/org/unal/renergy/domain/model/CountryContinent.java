package org.unal.renergy.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CountryContinent {
    private Long id;
    private String code;
    private Boolean isCountry;
    private String name;
}
