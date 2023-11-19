package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Cargo;


public interface ICargoService {
    
    public ResponseEntity<List<Cargo>> findAll();
}


