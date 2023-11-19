package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.Pastoreo;
import com.devops.granjaganadera.services.contracts.IPastoreoService;

@RestController
@RequestMapping("/pastoreos")
public class PastoreoController {

    @Autowired
    private IPastoreoService pastoreoService;


    @GetMapping("/list")
    private ResponseEntity<List<Pastoreo>> getAllPastoreos() {
        return this.pastoreoService.findAll();
    }
}
