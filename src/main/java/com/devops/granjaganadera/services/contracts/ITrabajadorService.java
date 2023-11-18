package com.devops.granjaganadera.services.contracts;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Trabajador;


public interface ITrabajadorService {

    public ResponseEntity<Trabajador> create(Trabajador trabajador);

    public ResponseEntity<Trabajador> show(long id);

    public ResponseEntity<Trabajador> update(Trabajador trabajador);

    public ResponseEntity<Boolean> delete(Long id);
    
}
