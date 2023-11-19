package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.RegistroAlimentacion;
import com.devops.granjaganadera.services.contracts.IRegistroAlimentacionService;

@RestController
@RequestMapping("/registrosAlimentacion")
public class RegistroAlimentacionController {

    @Autowired
    private IRegistroAlimentacionService registroAlimentacionService;


    @GetMapping("/list")
    private ResponseEntity<List<RegistroAlimentacion>> getAllRegistroAlimentacions() {
        return this.registroAlimentacionService.findAll();
    }
}
