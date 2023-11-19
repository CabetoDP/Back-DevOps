package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.Requests.IdRequest;
import com.devops.granjaganadera.entities.Trabajador;
import com.devops.granjaganadera.services.contracts.ITrabajadorService;

@RestController
@RequestMapping("/trabajadores")
public class TrabajadorController {

    @Autowired
    private ITrabajadorService trabajadorService;

    @PostMapping("/create")
    private  ResponseEntity<Trabajador> createUsuario(@RequestBody Trabajador trabajador) {
        return this.trabajadorService.create(trabajador);
    }

    @PostMapping("/show")
    private ResponseEntity<Trabajador> show(@RequestBody IdRequest id) {
        return this.trabajadorService.show(id.id);
    }

    @PutMapping("/update")
    private ResponseEntity<Trabajador> updateUsuario(@RequestBody Trabajador trabajador) {
        return this.trabajadorService.update(trabajador);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteUsuario(@RequestBody IdRequest id) {
        return this.trabajadorService.delete(id.id);
    }

    @GetMapping("/list")
    private ResponseEntity<List<Trabajador>> getAllTrabajadores() {
        return this.trabajadorService.findAll();
    }
}
