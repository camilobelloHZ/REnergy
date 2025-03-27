package org.unal.renergy.domain.repository;

import org.unal.renergy.domain.model.EnergyData;

import java.util.List;
import java.util.Optional;

public interface EnergyDataRepository {
    List<EnergyData> findAll();
    Optional<EnergyData> findById(Long id);
    Optional<EnergyData> findByName(String name);
}
