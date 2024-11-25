package com.kaeser.platform.inventory.application.internal.queryservices;

import com.kaeser.platform.inventory.domain.infraestructure.persistence.jpa.repositories.EquipmentRepository;
import com.kaeser.platform.inventory.domain.model.entities.Equipment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetEquipmentDetailsService {

    private final EquipmentRepository equipmentRepository;

    public Equipment getDetails(Long id) {
        return equipmentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Equipment not found"));
    }
}