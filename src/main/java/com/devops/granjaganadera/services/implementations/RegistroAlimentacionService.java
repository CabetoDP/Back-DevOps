package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IRegistroAlimentacionRepository;
import com.devops.granjaganadera.services.contracts.IRegistroAlimentacionService;

@Service
public class RegistroAlimentacionService implements IRegistroAlimentacionService {

    @Autowired
    private IRegistroAlimentacionRepository registroAlimentacionRepository;

    @Override
    public ResponseEntity<List<RegistroAlimentacion>> findAll() {
        try {
            List<RegistroAlimentacion> registroAlimentaciones = this.registroAlimentacionRepository.findAll();
            return new ResponseEntity<List<RegistroAlimentacion>>(registroAlimentaciones, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
