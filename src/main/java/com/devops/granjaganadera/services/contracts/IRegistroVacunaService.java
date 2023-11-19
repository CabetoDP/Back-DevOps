package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.RegistroVacuna;


public interface IRegistroVacunaService {
    
    public ResponseEntity<List<RegistroVacuna>> findAll();
}
