package org.unal.renergy.application.find;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.unal.renergy.domain.model.EnergyData;
import org.unal.renergy.domain.repository.EnergyDataRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EnergyDataFindUseCase {

    private final EnergyDataRepository energyDataRepository;

    public List<EnergyData> findAll() {
        return energyDataRepository.findAll();
    }

    public EnergyData findById(Long id) {
        return energyDataRepository.findById(id).orElse(null);
    }
}
