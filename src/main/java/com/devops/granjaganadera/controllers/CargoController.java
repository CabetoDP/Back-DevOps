package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Cargo;
import com.devops.granjaganadera.services.contracts.ICargoService;

@RestController
@RequestMapping("/cargos")
public class CargoController {

    @Autowired
    private ICargoService cargoService;


    @GetMapping("/list")
    private ResponseEntity<List<Cargo>> getAllCargos() {
        return this.cargoService.findAll();
    }
}


