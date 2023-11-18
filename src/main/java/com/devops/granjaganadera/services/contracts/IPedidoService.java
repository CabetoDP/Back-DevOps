package com.devops.granjaganadera.services.contracts;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Pedido;


public interface IPedidoService {

    public ResponseEntity<Pedido> create(Pedido pedido);

    public ResponseEntity<Pedido> show(long id);

    public ResponseEntity<Pedido> update(Pedido pedido);

    public ResponseEntity<Boolean> delete(Long id);
    
}
