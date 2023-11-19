package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IMantenimientoRepository;
import com.devops.granjaganadera.services.contracts.IMantenimientoService;

@Service
public class MantenimientoService implements IMantenimientoService {

    @Autowired
    private IMantenimientoRepository mantenimientoRepository;

    @Override
    public ResponseEntity<List<Mantenimiento>> findAll() {
        try {
            List<Mantenimiento> mantenimientos = this.mantenimientoRepository.findAll();
            return new ResponseEntity<List<Mantenimiento>>(mantenimientos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
