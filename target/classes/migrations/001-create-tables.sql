CREATE TABLE IF NOT EXISTS countries_continents
(
    id         SERIAL PRIMARY KEY,
    name       TEXT    NOT NULL,
    is_country BOOLEAN NOT NULL,
    code       VARCHAR(4)
);

CREATE TABLE IF NOT EXISTS energy_data
(
    id                      BIGSERIAL PRIMARY KEY,
    id_country_continent    INTEGER,
    date_year               INTEGER NOT NULL,
    solar_capacity          DECIMAL,
    biofuels_production_TWh DECIMAL,
    electricity_solar_TWh   DECIMAL,
    electricity_wind_TWh    DECIMAL,
    electricity_hydro_TWh   DECIMAL,
    renewables_percentage   DECIMAL
);

ALTER TABLE energy_data
    ADD CONSTRAINT fk_energy_data_id_country_continent FOREIGN KEY (id_country_continent) REFERENCES countries_continents (id);
