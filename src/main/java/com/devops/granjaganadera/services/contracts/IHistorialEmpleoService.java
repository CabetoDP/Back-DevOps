package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.HistorialEmpleo;


public interface IHistorialEmpleoService {
    
    public ResponseEntity<List<HistorialEmpleo>> findAll();
}
