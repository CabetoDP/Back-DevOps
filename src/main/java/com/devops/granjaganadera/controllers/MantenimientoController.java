package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Mantenimiento;
import com.devops.granjaganadera.services.contracts.IMantenimientoService;

@RestController
@RequestMapping("/mantenimientos")
public class MantenimientoController {

    @Autowired
    private IMantenimientoService mantenimientoService;


    @GetMapping("/list")
    private ResponseEntity<List<Mantenimiento>> getAllMantenimientos() {
        return this.mantenimientoService.findAll();
    }
}
