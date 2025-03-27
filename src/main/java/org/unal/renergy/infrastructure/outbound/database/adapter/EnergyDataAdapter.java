package org.unal.renergy.infrastructure.outbound.database.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.unal.renergy.domain.model.EnergyData;
import org.unal.renergy.domain.repository.EnergyDataRepository;
import org.unal.renergy.infrastructure.outbound.database.dataaccess.EnergyDataDataAccess;
import org.unal.renergy.infrastructure.outbound.database.entities.EnergyDataEntity;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class EnergyDataAdapter implements EnergyDataRepository {

    private final EnergyDataDataAccess dataAccess;

    @Override
    public List<EnergyData> findAll() {
        return dataAccess.findAll()
                .stream()
                .map(EnergyDataEntity::toEnergyData)
                .toList();
    }

    @Override
    public Optional<EnergyData> findById(Long id) {
        return dataAccess.findById(id)
                .stream()
                .map(EnergyDataEntity::toEnergyData)
                .findAny();
    }

    @Override
    public Optional<EnergyData> findByName(String name) {
        return dataAccess.findByName(name)
                .stream()
                .map(EnergyDataEntity::toEnergyData)
                .findAny();
    }
}
