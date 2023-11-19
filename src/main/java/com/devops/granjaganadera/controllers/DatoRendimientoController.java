package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.DatoRendimiento;
import com.devops.granjaganadera.services.contracts.IDatoRendimientoService;

@RestController
@RequestMapping("/datosRendimiento")
public class DatoRendimientoController {

    @Autowired
    private IDatoRendimientoService datoRendimientoService;


    @GetMapping("/list")
    private ResponseEntity<List<DatoRendimiento>> getAllDatoRendimientos() {
        return this.datoRendimientoService.findAll();
    }
}
