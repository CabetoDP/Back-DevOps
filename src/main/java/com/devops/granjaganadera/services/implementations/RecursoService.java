package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IRecursoRepository;
import com.devops.granjaganadera.services.contracts.IRecursoService;

@Service
public class RecursoService implements IRecursoService {

    @Autowired
    private IRecursoRepository recursoRepository;

    @Override
    public ResponseEntity<List<Recurso>> findAll() {
        try {
            List<Recurso> recursos = this.recursoRepository.findAll();
            return new ResponseEntity<List<Recurso>>(recursos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
