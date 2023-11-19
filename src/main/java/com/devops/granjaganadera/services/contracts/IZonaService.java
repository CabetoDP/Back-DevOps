package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Zona;


public interface IZonaService {
    
    public ResponseEntity<List<Zona>> findAll();
}
