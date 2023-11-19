package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.granjaganadera.entities.ContenidoPedido;
import com.devops.granjaganadera.services.contracts.IContenidoPedidoService;

@RestController
@RequestMapping("/contenidoPedidos")
public class ContenidoPedidoController {

    @Autowired
    private IContenidoPedidoService contenidoPedidoService;


    @GetMapping("/list")
    private ResponseEntity<List<ContenidoPedido>> getAllContenidoPedidos() {
        return this.contenidoPedidoService.findAll();
    }
}
