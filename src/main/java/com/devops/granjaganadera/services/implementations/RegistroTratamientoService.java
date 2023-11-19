package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IRegistroTratamientoRepository;
import com.devops.granjaganadera.services.contracts.IRegistroTratamientoService;

@Service
public class RegistroTratamientoService implements IRegistroTratamientoService {

    @Autowired
    private IRegistroTratamientoRepository registroTratamientoRepository;

    @Override
    public ResponseEntity<List<RegistroTratamiento>> findAll() {
        try {
            List<RegistroTratamiento> registroTratamientos = this.registroTratamientoRepository.findAll();
            return new ResponseEntity<List<RegistroTratamiento>>(registroTratamientos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
