package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Producto;


public interface IProductoService {

    public ResponseEntity<Producto> create(Producto producto);

    public ResponseEntity<Producto> show(long id);

    public ResponseEntity<Producto> update(Producto producto);

    public ResponseEntity<Boolean> delete(Long id);
    
    public ResponseEntity<List<Producto>> findAll();
}
