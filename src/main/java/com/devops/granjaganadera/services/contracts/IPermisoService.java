package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Permiso;


public interface IPermisoService {
    
    public ResponseEntity<List<Permiso>> findAll();
}
