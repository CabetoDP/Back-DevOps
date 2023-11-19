package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IInfoNacimientoRepository;
import com.devops.granjaganadera.services.contracts.IInfoNacimientoService;

@Service
public class InfoNacimientoService implements IInfoNacimientoService {

    @Autowired
    private IInfoNacimientoRepository infoNacimientoRepository;

    @Override
    public ResponseEntity<List<InfoNacimiento>> findAll() {
        try {
            List<InfoNacimiento> infoNacimientos = this.infoNacimientoRepository.findAll();
            return new ResponseEntity<List<InfoNacimiento>>(infoNacimientos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
