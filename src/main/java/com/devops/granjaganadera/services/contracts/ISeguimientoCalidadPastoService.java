package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.SeguimientoCalidadPasto;


public interface ISeguimientoCalidadPastoService {
    
    public ResponseEntity<List<SeguimientoCalidadPasto>> findAll();
}
