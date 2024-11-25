package com.kaeser.platform.inventory.application.internal.commandservices;

import com.kaeser.platform.inventory.domain.model.entities.Equipment;
import com.kaeser.platform.inventory.domain.infraestructure.persistence.jpa.repositories.EquipmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateEquipmentService {

    private final EquipmentRepository equipmentRepository;

    public Equipment create(Equipment equipment) {
        // Genera automáticamente el materialSerialNumber y equipmentType si es necesario
        // Esto puede incluir validaciones antes de guardar
        return equipmentRepository.save(equipment);
    }
}