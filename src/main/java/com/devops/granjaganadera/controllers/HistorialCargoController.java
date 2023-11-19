package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.HistorialCargo;
import com.devops.granjaganadera.services.contracts.IHistorialCargoService;

@RestController
@RequestMapping("/historialesCargo")
public class HistorialCargoController {

    @Autowired
    private IHistorialCargoService historialCargoService;


    @GetMapping("/list")
    private ResponseEntity<List<HistorialCargo>> getAllHistorialCargos() {
        return this.historialCargoService.findAll();
    }
}
