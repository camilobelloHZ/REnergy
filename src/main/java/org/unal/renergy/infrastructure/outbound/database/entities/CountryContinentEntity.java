package org.unal.renergy.infrastructure.outbound.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.unal.renergy.domain.model.CountryContinent;

@Entity
@Data
@Table(name = "countries_continents")
public class CountryContinentEntity {

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;

    @Column(name = "is_country")
    private Boolean isCountry;
    private String name;

    public static CountryContinentEntity fromCountryContinent(CountryContinent countryContinent) {
        CountryContinentEntity entity = new CountryContinentEntity();
        entity.setCode(countryContinent.getCode());
        entity.setIsCountry(countryContinent.getIsCountry());
        entity.setName(countryContinent.getName());
        return entity;
    }

    public CountryContinent toCountryContinent() {
        return CountryContinent.builder()
                .id(this.id)
                .code(this.code)
                .name(this.name)
                .build();
    }
}
