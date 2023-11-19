package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.RegistroEnfermedad;


public interface IRegistroEnfermedadService {
    
    public ResponseEntity<List<RegistroEnfermedad>> findAll();
}