package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.RegistroSignosVitales;


public interface IRegistroSignosVitalesService {
    
    public ResponseEntity<List<RegistroSignosVitales>> findAll();
}
