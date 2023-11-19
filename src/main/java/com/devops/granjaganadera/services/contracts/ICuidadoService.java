package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Cuidado;


public interface ICuidadoService {
    
    public ResponseEntity<List<Cuidado>> findAll();
}
