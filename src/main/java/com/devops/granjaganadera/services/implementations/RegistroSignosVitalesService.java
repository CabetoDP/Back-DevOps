package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IRegistroSignosVitalesRepository;
import com.devops.granjaganadera.services.contracts.IRegistroSignosVitalesService;

@Service
public class RegistroSignosVitalesService implements IRegistroSignosVitalesService {

    @Autowired
    private IRegistroSignosVitalesRepository registroSignosVitalesRepository;

    @Override
    public ResponseEntity<List<RegistroSignosVitales>> findAll() {
        try {
            List<RegistroSignosVitales> registroSignosVitales = this.registroSignosVitalesRepository.findAll();
            return new ResponseEntity<List<RegistroSignosVitales>>(registroSignosVitales, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
