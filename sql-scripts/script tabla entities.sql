CREATE TABLE entities (
    id SERIAL PRIMARY KEY,
    entity VARCHAR(255) NOT NULL,
    tipo INT NOT NULL
);

-- Insertar continentes (tipo = 0)
INSERT INTO entities (entity, tipo)
SELECT DISTINCT entity, 0
FROM (
    SELECT entity FROM electricity_hydro_twh_continents
    UNION
    SELECT entity FROM renewables_continents
    UNION
    SELECT entity FROM solar_capacity_continents
    UNION
    SELECT entity FROM electricity_twh_wind_continents
    UNION
    SELECT entity FROM electricity_solar_twh_continents
    UNION
    SELECT entity FROM biofuels_production_twh_continents
) AS continents;

-- Insertar países (tipo = 1)
INSERT INTO entities (entity, tipo)
SELECT DISTINCT entity, 1
FROM (
    SELECT entity FROM electricity_twh_wind_countries
    UNION
    SELECT entity FROM electricity_solar_twh_countries
    UNION
    SELECT entity FROM electricity_hydro_twh_countries
    UNION
    SELECT entity FROM biofuels_production_twh_countries
    UNION
    SELECT entity FROM renewables_countries
    UNION
    SELECT entity FROM solar_capacity_countries
) AS countries;