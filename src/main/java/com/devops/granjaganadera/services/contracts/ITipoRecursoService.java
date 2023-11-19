package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.TipoRecurso;


public interface ITipoRecursoService {
    
    public ResponseEntity<List<TipoRecurso>> findAll();
}
