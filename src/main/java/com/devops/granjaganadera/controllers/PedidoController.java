package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.Requests.IdRequest;
import com.devops.granjaganadera.entities.Pedido;
import com.devops.granjaganadera.services.contracts.IPedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private IPedidoService pedidoService;

    @PostMapping("/create")
    private  ResponseEntity<Pedido> createUsuario(@RequestBody Pedido pedido) {
        return this.pedidoService.create(pedido);
    }

    @PostMapping("/show")
    private ResponseEntity<Pedido> show(@RequestBody IdRequest id) {
        return this.pedidoService.show(id.id);
    }

    @PutMapping("/update")
    private ResponseEntity<Pedido> updateUsuario(@RequestBody Pedido pedido) {
        return this.pedidoService.update(pedido);
    }

    @DeleteMapping("/delete")
    private ResponseEntity<Boolean> deleteUsuario(@RequestBody IdRequest id) {
        return this.pedidoService.delete(id.id);
    }

    @GetMapping("/list")
    private ResponseEntity<List<Pedido>> getAllPedidos() {
        return this.pedidoService.findAll();
    }
}