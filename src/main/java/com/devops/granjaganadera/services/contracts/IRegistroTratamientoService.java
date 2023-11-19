package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.RegistroTratamiento;


public interface IRegistroTratamientoService {
    
    public ResponseEntity<List<RegistroTratamiento>> findAll();
}
