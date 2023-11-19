package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Zona;
import com.devops.granjaganadera.services.contracts.IZonaService;

@RestController
@RequestMapping("/zonas")
public class ZonaController {

    @Autowired
    private IZonaService zonaService;


    @GetMapping("/list")
    private ResponseEntity<List<Zona>> getAllZonas() {
        return this.zonaService.findAll();
    }
}
