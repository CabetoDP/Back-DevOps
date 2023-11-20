package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.SeguimientoCalidadPasto;
import com.devops.granjaganadera.services.contracts.ISeguimientoCalidadPastoService;

@RestController
@RequestMapping("/seguimientosCalidadPasto")
public class SeguimientoCalidadPastoController {

    @Autowired
    private ISeguimientoCalidadPastoService seguimientoCalidadPastoService;


    @GetMapping("/list")
    private ResponseEntity<List<SeguimientoCalidadPasto>> getAllSeguimientoCalidadPastos() {
        return this.seguimientoCalidadPastoService.findAll();
    }
}
