CREATE TABLE countries_continents (
                                      id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
                                      code VARCHAR(255),
                                      is_country BOOLEAN,
                                      name VARCHAR(255) UNIQUE  -- ¡Esta es la clave!
);


CREATE TABLE energy_data (
                             id BIGINT PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
                             energy_name VARCHAR(255) UNIQUE
);

CREATE TABLE energy_countries_continents (
                                             id INTEGER PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
                                             id_country_continent BIGINT,
                                             id_energy BIGINT,
                                             date_year INTEGER,
                                             value NUMERIC,
                                             FOREIGN KEY (id_country_continent) REFERENCES countries_continents(id),
                                             FOREIGN KEY (id_energy) REFERENCES energy_data(id)
);

ALTER TABLE energy_countries_continents
    ADD CONSTRAINT unique_energy_entry UNIQUE (id_country_continent, id_energy, date_year);
