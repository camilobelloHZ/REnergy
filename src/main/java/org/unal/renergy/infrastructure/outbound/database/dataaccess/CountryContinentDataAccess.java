package org.unal.renergy.infrastructure.outbound.database.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unal.renergy.infrastructure.outbound.database.entities.CountryContinentEntity;

public interface CountryContinentDataAccess extends JpaRepository<CountryContinentEntity, Long> { }
