package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.ICargoRepository;
import com.devops.granjaganadera.services.contracts.ICargoService;

@Service
public class CargoService implements ICargoService {

    @Autowired
    private ICargoRepository cargoRepository;

    @Override
    public ResponseEntity<List<Cargo>> findAll() {
        try {
            List<Cargo> cargos = this.cargoRepository.findAll();
            return new ResponseEntity<List<Cargo>>(cargos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}


