package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.TipoRecurso;
import com.devops.granjaganadera.services.contracts.ITipoRecursoService;

@RestController
@RequestMapping("/tiposRecurso")
public class TipoRecursoController {

    @Autowired
    private ITipoRecursoService tipoRecursoService;


    @GetMapping("/list")
    private ResponseEntity<List<TipoRecurso>> getAllTipoRecursos() {
        return this.tipoRecursoService.findAll();
    }
}
