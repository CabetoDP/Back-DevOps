package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.RegistroTratamiento;
import com.devops.granjaganadera.services.contracts.IRegistroTratamientoService;

@RestController
@RequestMapping("/registrosTratamiento")
public class RegistroTratamientoController {

    @Autowired
    private IRegistroTratamientoService registroTratamientoService;


    @GetMapping("/list")
    private ResponseEntity<List<RegistroTratamiento>> getAllRegistroTratamientos() {
        return this.registroTratamientoService.findAll();
    }
}
