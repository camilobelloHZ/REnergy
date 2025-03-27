package org.unal.renergy.infrastructure.outbound.database.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.unal.renergy.domain.model.EnergyData;

@Entity
@Data
@Table(name = "energy_data")
public class EnergyDataEntity {

    @Id
    @Column(updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "energy_name")
    private String name;

    public static EnergyDataEntity fromEnergyData(EnergyData energyData) {
        EnergyDataEntity entity = new EnergyDataEntity();
        entity.setName(energyData.getName());
        return entity;
    }

    public EnergyData toEnergyData() {
        return EnergyData.builder()
                .id(id)
                .name(name)
                .build();
    }
}
