package org.unal.renergy.infrastructure.outbound.database.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.unal.renergy.infrastructure.outbound.database.entities.EnergyDataEntity;

import java.util.Optional;

public interface EnergyDataDataAccess extends JpaRepository<EnergyDataEntity, Long> {
    Optional<EnergyDataEntity> findByName(String name);
}
