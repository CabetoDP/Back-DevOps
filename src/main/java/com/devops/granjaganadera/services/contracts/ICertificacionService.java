package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Certificacion;


public interface ICertificacionService {
    
    public ResponseEntity<List<Certificacion>> findAll();
}
