package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Permiso;
import com.devops.granjaganadera.services.contracts.IPermisoService;

@RestController
@RequestMapping("/permisos")
public class PermisoController {

    @Autowired
    private IPermisoService permisoService;


    @GetMapping("/list")
    private ResponseEntity<List<Permiso>> getAllPermisos() {
        return this.permisoService.findAll();
    }
}
