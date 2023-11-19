package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Parcela;


public interface IParcelaService {
    
    public ResponseEntity<List<Parcela>> findAll();
}
