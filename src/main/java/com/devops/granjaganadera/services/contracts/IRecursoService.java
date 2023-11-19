package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Recurso;


public interface IRecursoService {
    
    public ResponseEntity<List<Recurso>> findAll();
}
