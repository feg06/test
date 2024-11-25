package com.kaeser.platform.inventory.domain.interfaces.rest.resource;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EquipmentDTO {

    private Long id;
    private String materialSerialNumber;
    private String equipmentType;
}