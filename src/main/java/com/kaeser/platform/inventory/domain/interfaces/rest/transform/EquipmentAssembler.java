package com.kaeser.platform.inventory.domain.interfaces.rest.transform;

import com.kaeser.platform.inventory.domain.model.entities.Equipment;
import com.kaeser.platform.inventory.domain.interfaces.rest.resource.EquipmentDTO;
import org.springframework.stereotype.Component;

@Component
public class EquipmentAssembler {

    public EquipmentDTO toDTO(Equipment equipment) {
        return new EquipmentDTO(equipment.getId(), equipment.getMaterialSerialNumber(), equipment.getEquipmentType());
    }

    // Otros métodos para convertir de DTO a entidad si es necesario
}