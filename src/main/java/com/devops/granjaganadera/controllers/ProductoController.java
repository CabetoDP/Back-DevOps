package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.Requests.IdRequest;
import com.devops.granjaganadera.entities.Producto;
import com.devops.granjaganadera.services.contracts.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @PostMapping("/create")
    private  ResponseEntity<Producto> createUsuario(@RequestBody Producto producto) {
        return this.productoService.create(producto);
    }

    @PostMapping("/show")
    private ResponseEntity<Producto> show(@RequestBody IdRequest id) {
        return this.productoService.show(id.id);
    }

    @PutMapping("/update")
    private ResponseEntity<Producto> updateUsuario(@RequestBody Producto producto) {
        return this.productoService.update(producto);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteUsuario(@RequestBody IdRequest id) {
        return this.productoService.delete(id.id);
    }

    @GetMapping("/list")
    private ResponseEntity<List<Producto>> getAllAnimals() {
        return this.productoService.findAll();
    }
}
