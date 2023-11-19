package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Parto;
import com.devops.granjaganadera.services.contracts.IPartoService;

@RestController
@RequestMapping("/partos")
public class PartoController {

    @Autowired
    private IPartoService partoService;


    @GetMapping("/list")
    private ResponseEntity<List<Parto>> getAllPartos() {
        return this.partoService.findAll();
    }
}
