package com.kaeser.platform.inventory.domain.infraestructure.persistence.jpa.repositories;

import com.kaeser.platform.inventory.domain.model.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Long> {
}