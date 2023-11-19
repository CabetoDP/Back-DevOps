package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.ICertificacionRepository;
import com.devops.granjaganadera.services.contracts.ICertificacionService;

@Service
public class CertificacionService implements ICertificacionService {

    @Autowired
    private ICertificacionRepository certificacionRepository;

    @Override
    public ResponseEntity<List<Certificacion>> findAll() {
        try {
            List<Certificacion> certificacions = this.certificacionRepository.findAll();
            return new ResponseEntity<List<Certificacion>>(certificacions, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
