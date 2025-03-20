package org.unal.renergy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnergyDataRepository extends JpaRepository<EnergyDataEntity, Long> { }
