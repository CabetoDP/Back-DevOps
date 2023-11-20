package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.RegistroVacuna;
import com.devops.granjaganadera.services.contracts.IRegistroVacunaService;

@RestController
@RequestMapping("/registrosVacuna")
public class RegistroVacunaController {

    @Autowired
    private IRegistroVacunaService registroVacunaService;


    @GetMapping("/list")
    private ResponseEntity<List<RegistroVacuna>> getAllRegistroVacunas() {
        return this.registroVacunaService.findAll();
    }
}
