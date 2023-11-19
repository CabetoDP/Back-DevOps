package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.ICuidadoRepository;
import com.devops.granjaganadera.services.contracts.ICuidadoService;

@Service
public class CuidadoService implements ICuidadoService {

    @Autowired
    private ICuidadoRepository cuidadoRepository;

    @Override
    public ResponseEntity<List<Cuidado>> findAll() {
        try {
            List<Cuidado> cuidados = this.cuidadoRepository.findAll();
            return new ResponseEntity<List<Cuidado>>(cuidados, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
