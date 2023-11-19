package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.RegistroInventario;


public interface IRegistroInventarioService {
    
    public ResponseEntity<List<RegistroInventario>> findAll();
}
