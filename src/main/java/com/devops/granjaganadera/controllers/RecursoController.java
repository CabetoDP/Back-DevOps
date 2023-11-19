package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Recurso;
import com.devops.granjaganadera.services.contracts.IRecursoService;

@RestController
@RequestMapping("/recursos")
public class RecursoController {

    @Autowired
    private IRecursoService recursoService;


    @GetMapping("/list")
    private ResponseEntity<List<Recurso>> getAllRecursos() {
        return this.recursoService.findAll();
    }
}
