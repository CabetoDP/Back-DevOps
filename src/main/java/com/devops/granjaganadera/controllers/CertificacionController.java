package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Certificacion;
import com.devops.granjaganadera.services.contracts.ICertificacionService;

@RestController
@RequestMapping("/certificaciones")
public class CertificacionController {

    @Autowired
    private ICertificacionService certificacionService;


    @GetMapping("/list")
    private ResponseEntity<List<Certificacion>> getAllCertificacions() {
        return this.certificacionService.findAll();
    }
}
