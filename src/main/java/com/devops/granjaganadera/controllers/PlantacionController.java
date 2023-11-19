package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Plantacion;
import com.devops.granjaganadera.services.contracts.IPlantacionService;

@RestController
@RequestMapping("/plantaciones")
public class PlantacionController {

    @Autowired
    private IPlantacionService plantacionService;


    @GetMapping("/list")
    private ResponseEntity<List<Plantacion>> getAllPlantacions() {
        return this.plantacionService.findAll();
    }
}
