package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.DatoRendimiento;


public interface IDatoRendimientoService {
    
    public ResponseEntity<List<DatoRendimiento>> findAll();
    
}
