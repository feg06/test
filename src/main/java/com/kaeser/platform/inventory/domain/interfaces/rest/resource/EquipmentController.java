package com.kaeser.platform.inventory.domain.interfaces.rest.resource;

import com.kaeser.platform.inventory.application.internal.commandservices.CreateEquipmentService;
import com.kaeser.platform.inventory.domain.model.entities.Equipment;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/equipments")
@RequiredArgsConstructor
public class EquipmentController {

    private final CreateEquipmentService createEquipmentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Equipment createEquipment(@RequestBody Equipment equipment) {
        return createEquipmentService.create(equipment);
    }
}