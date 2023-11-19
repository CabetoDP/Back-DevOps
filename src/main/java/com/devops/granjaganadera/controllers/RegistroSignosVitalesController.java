package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.RegistroSignosVitales;
import com.devops.granjaganadera.services.contracts.IRegistroSignosVitalesService;

@RestController
@RequestMapping("/registroSignosVitaless")
public class RegistroSignosVitalesController {

    @Autowired
    private IRegistroSignosVitalesService registroSignosVitalesService;


    @GetMapping("/list")
    private ResponseEntity<List<RegistroSignosVitales>> getAllRegistroSignosVitaless() {
        return this.registroSignosVitalesService.findAll();
    }
}
