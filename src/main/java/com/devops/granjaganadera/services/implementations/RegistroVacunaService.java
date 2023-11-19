package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IRegistroVacunaRepository;
import com.devops.granjaganadera.services.contracts.IRegistroVacunaService;

@Service
public class RegistroVacunaService implements IRegistroVacunaService {

    @Autowired
    private IRegistroVacunaRepository registroVacunaRepository;

    @Override
    public ResponseEntity<List<RegistroVacuna>> findAll() {
        try {
            List<RegistroVacuna> registroVacunas = this.registroVacunaRepository.findAll();
            return new ResponseEntity<List<RegistroVacuna>>(registroVacunas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
