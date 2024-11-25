package com.kaeser.platform.inventory.domain.model.commands;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateEquipmentCommand {

    private String materialSerialNumber;
    private String equipmentType;
}