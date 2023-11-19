package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IHistorialCargoRepository;
import com.devops.granjaganadera.services.contracts.IHistorialCargoService;

@Service
public class HistorialCargosService implements IHistorialCargoService {

    @Autowired
    private IHistorialCargoRepository historialCargosRepository;

    @Override
    public ResponseEntity<List<HistorialCargo>> findAll() {
        try {
            List<HistorialCargo> historialCargos = this.historialCargosRepository.findAll();
            return new ResponseEntity<List<HistorialCargo>>(historialCargos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
