package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IRegistroInventarioRepository;
import com.devops.granjaganadera.services.contracts.IRegistroInventarioService;

@Service
public class RegistroInventarioService implements IRegistroInventarioService {

    @Autowired
    private IRegistroInventarioRepository registroInventarioRepository;

    @Override
    public ResponseEntity<List<RegistroInventario>> findAll() {
        try {
            List<RegistroInventario> registroInventarios = this.registroInventarioRepository.findAll();
            return new ResponseEntity<List<RegistroInventario>>(registroInventarios, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
