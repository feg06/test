package com.kaeser.platform.inventory.domain.model.entities;

import com.kaeser.platform.shared.domain.model.entities.AuditableModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Equipment extends AuditableModel {

    @Column(nullable = false)
    private String materialSerialNumber;

    @Column(nullable = false)
    private String equipmentType;

    // Constructor para creación
    public Equipment(String materialSerialNumber, String equipmentType) {
        this.materialSerialNumber = materialSerialNumber;
        this.equipmentType = equipmentType;
    }
}