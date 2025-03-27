package org.unal.renergy.domain.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class EnergyData {
    private Long id;
    private String name;
}
