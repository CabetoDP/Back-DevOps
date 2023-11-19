package com.devops.granjaganadera.services.contracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.RegistroAlimentacion;


public interface IRegistroAlimentacionService {
    
    public ResponseEntity<List<RegistroAlimentacion>> findAll();
}
