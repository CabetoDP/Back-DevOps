package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Pastoreo;


public interface IPastoreoService {
    
    public ResponseEntity<List<Pastoreo>> findAll();
}
