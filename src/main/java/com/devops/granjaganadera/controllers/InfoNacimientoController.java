package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.InfoNacimiento;
import com.devops.granjaganadera.services.contracts.IInfoNacimientoService;

@RestController
@RequestMapping("/infoNacimientos")
public class InfoNacimientoController {

    @Autowired
    private IInfoNacimientoService infoNacimientoService;


    @GetMapping("/list")
    private ResponseEntity<List<InfoNacimiento>> getAllInfoNacimientos() {
        return this.infoNacimientoService.findAll();
    }
}
