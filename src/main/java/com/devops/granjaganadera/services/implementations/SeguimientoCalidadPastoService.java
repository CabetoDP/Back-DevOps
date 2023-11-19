package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.ISeguimientoCalidadPastoRepository;
import com.devops.granjaganadera.services.contracts.ISeguimientoCalidadPastoService;

@Service
public class SeguimientoCalidadPastoService implements ISeguimientoCalidadPastoService {

    @Autowired
    private ISeguimientoCalidadPastoRepository seguimientoCalidadPastoRepository;

    @Override
    public ResponseEntity<List<SeguimientoCalidadPasto>> findAll() {
        try {
            List<SeguimientoCalidadPasto> seguimientoCalidadPastos = this.seguimientoCalidadPastoRepository.findAll();
            return new ResponseEntity<List<SeguimientoCalidadPasto>>(seguimientoCalidadPastos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
