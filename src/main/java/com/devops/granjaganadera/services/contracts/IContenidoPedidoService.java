package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.ContenidoPedido;


public interface IContenidoPedidoService {
    
    public ResponseEntity<List<ContenidoPedido>> findAll();
}
