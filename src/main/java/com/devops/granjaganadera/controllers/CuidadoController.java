package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Cuidado;
import com.devops.granjaganadera.services.contracts.ICuidadoService;

@RestController
@RequestMapping("/cuidados")
public class CuidadoController {

    @Autowired
    private ICuidadoService cuidadoService;


    @GetMapping("/list")
    private ResponseEntity<List<Cuidado>> getAllCuidados() {
        return this.cuidadoService.findAll();
    }
}
