package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Plantacion;


public interface IPlantacionService {
    
    public ResponseEntity<List<Plantacion>> findAll();
}
