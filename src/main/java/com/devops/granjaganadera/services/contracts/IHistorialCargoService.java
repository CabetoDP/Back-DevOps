package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.HistorialCargo;


public interface IHistorialCargoService {
    
    public ResponseEntity<List<HistorialCargo>> findAll();
    
}
