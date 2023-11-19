package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IHistorialEmpleoRepository;
import com.devops.granjaganadera.services.contracts.IHistorialEmpleoService;

@Service
public class HistorialEmpleoService implements IHistorialEmpleoService {

    @Autowired
    private IHistorialEmpleoRepository historialEmpleosRepository;

    @Override
    public ResponseEntity<List<HistorialEmpleo>> findAll() {
        try {
            List<HistorialEmpleo> historialEmpleos = this.historialEmpleosRepository.findAll();
            return new ResponseEntity<List<HistorialEmpleo>>(historialEmpleos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
