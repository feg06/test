package com.kaeser.platform.inventory.domain.model.aggregates;

import com.kaeser.platform.inventory.domain.model.entities.Equipment;
import lombok.Getter;

@Getter
public class EquipmentAggregate {

    private final Equipment equipment;

    public EquipmentAggregate(Equipment equipment) {
        this.equipment = equipment;
    }

    // Métodos para manipular la lógica del agregado, si es necesario
}