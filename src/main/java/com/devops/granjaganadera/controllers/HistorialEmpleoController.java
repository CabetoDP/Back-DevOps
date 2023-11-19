package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.HistorialEmpleo;
import com.devops.granjaganadera.services.contracts.IHistorialEmpleoService;

@RestController
@RequestMapping("/historialesEmpleo")
public class HistorialEmpleoController {

    @Autowired
    private IHistorialEmpleoService historialEmpleoService;


    @GetMapping("/list")
    private ResponseEntity<List<HistorialEmpleo>> getAllHistorialEmpleos() {
        return this.historialEmpleoService.findAll();
    }
}
