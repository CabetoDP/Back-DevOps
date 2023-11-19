package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IPartoRepository;
import com.devops.granjaganadera.services.contracts.IPartoService;

@Service
public class PartoService implements IPartoService {

    @Autowired
    private IPartoRepository partoRepository;

    @Override
    public ResponseEntity<List<Parto>> findAll() {
        try {
            List<Parto> partos = this.partoRepository.findAll();
            return new ResponseEntity<List<Parto>>(partos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
