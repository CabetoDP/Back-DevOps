package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Parcela;
import com.devops.granjaganadera.services.contracts.IParcelaService;

@RestController
@RequestMapping("/parcelas")
public class ParcelaController {

    @Autowired
    private IParcelaService parcelaService;


    @GetMapping("/list")
    private ResponseEntity<List<Parcela>> getAllParcelas() {
        return this.parcelaService.findAll();
    }
}
