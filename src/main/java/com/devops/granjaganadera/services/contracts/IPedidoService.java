package com.devops.granjaganadera.services.contracts;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Pedido;


public interface IPedidoService {

    public ResponseEntity<Pedido> create(Pedido pedido);

    public ResponseEntity<Pedido> show(long id);

    public ResponseEntity<Pedido> update(Pedido pedido);

    public ResponseEntity<Boolean> delete(Long id);
    
    public ResponseEntity<List<Pedido>> findAll();

    public ResponseEntity<List<Map<String, Object>>> obtenerInformacionPedidos();

    public ResponseEntity <List<Map<String, Object>>> obtenerCantidadProductosYArticulos();

    public ResponseEntity <List<Map<String, Object>>> obtenerPrecioTotalPorPedido();

    
}
