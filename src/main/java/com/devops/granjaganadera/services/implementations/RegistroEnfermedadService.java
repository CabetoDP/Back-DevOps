package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IRegistroEnfermedadRepository;
import com.devops.granjaganadera.services.contracts.IRegistroEnfermedadService;

@Service
public class RegistroEnfermedadService implements IRegistroEnfermedadService {

    @Autowired
    private IRegistroEnfermedadRepository registroEnfermedadRepository;

    @Override
    public ResponseEntity<List<RegistroEnfermedad>> findAll() {
        try {
            List<RegistroEnfermedad> registroEnfermedad = this.registroEnfermedadRepository.findAll();
            return new ResponseEntity<List<RegistroEnfermedad>>(registroEnfermedad, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}