package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.InfoNacimiento;


public interface IInfoNacimientoService {
    
    public ResponseEntity<List<InfoNacimiento>> findAll();
}
