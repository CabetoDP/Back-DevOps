package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Parto;


public interface IPartoService {
    
    public ResponseEntity<List<Parto>> findAll();
}
