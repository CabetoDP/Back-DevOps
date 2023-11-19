package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.RegistroEnfermedad;
import com.devops.granjaganadera.services.contracts.IRegistroEnfermedadService;

@RestController
@RequestMapping("/registrosEnfermedad")
public class RegistroEnfermedadController {

    @Autowired
    private IRegistroEnfermedadService registroEnfermedadService;


    @GetMapping("/list")
    private ResponseEntity<List<RegistroEnfermedad>> getAllRegistroEnfermedadess() {
        return this.registroEnfermedadService.findAll();
    }
}