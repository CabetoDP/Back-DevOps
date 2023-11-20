package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.RegistroInventario;
import com.devops.granjaganadera.services.contracts.IRegistroInventarioService;

@RestController
@RequestMapping("/registrosInventario")
public class RegistroInventarioController {

    @Autowired
    private IRegistroInventarioService registroInventarioService;


    @GetMapping("/list")
    private ResponseEntity<List<RegistroInventario>> getAllRegistroInventarios() {
        return this.registroInventarioService.findAll();
    }
}
