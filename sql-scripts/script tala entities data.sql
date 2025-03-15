CREATE TABLE entity_data (
    id SERIAL PRIMARY KEY,
    entity_id INT REFERENCES entities(id),
    year INT,
    electricity_twh_wind FLOAT,
    electricity_solar_twh FLOAT,
    electricity_hydro_twh FLOAT,
    biofuels_production_twh FLOAT,
    renewables FLOAT,
    solar_capacity FLOAT
);

-- Insertar datos de electricidad eólica por países
INSERT INTO entity_data (entity_id, year, electricity_twh_wind)
SELECT e.id, ew.year, ew.electricity_twh_wind
FROM electricity_twh_wind_countries ew
JOIN entities e ON ew.entity = e.entity;

-- Insertar datos de electricidad solar por países
INSERT INTO entity_data (entity_id, year, electricity_solar_twh)
SELECT e.id, es.year, es.electricity_solar_twh
FROM electricity_solar_twh_countries es
JOIN entities e ON es.entity = e.entity;

-- Insertar datos de electricidad hidroeléctrica por países
INSERT INTO entity_data (entity_id, year, electricity_hydro_twh)
SELECT e.id, eh.year, eh.electricity_hydro_twh
FROM electricity_hydro_twh_countries eh
JOIN entities e ON eh.entity = e.entity;

-- Insertar datos de producción de biocombustibles por países
INSERT INTO entity_data (entity_id, year, biofuels_production_twh)
SELECT e.id, eb.year, eb.biofuels_production_twh
FROM biofuels_production_twh_countries eb
JOIN entities e ON eb.entity = e.entity;

-- Insertar datos de energías renovables por países
INSERT INTO entity_data (entity_id, year, renewables)
SELECT e.id, er.year, er.renewables
FROM renewables_countries er
JOIN entities e ON er.entity = e.entity;

-- Insertar datos de capacidad solar por países
INSERT INTO entity_data (entity_id, year, solar_capacity)
SELECT e.id, sc.year, sc.solar_capacity
FROM solar_capacity_countries sc
JOIN entities e ON sc.entity = e.entity;
