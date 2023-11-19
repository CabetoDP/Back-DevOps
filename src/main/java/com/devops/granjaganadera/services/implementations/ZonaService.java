package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IZonaRepository;
import com.devops.granjaganadera.services.contracts.IZonaService;

@Service
public class ZonaService implements IZonaService {

    @Autowired
    private IZonaRepository zonaRepository;

    @Override
    public ResponseEntity<List<Zona>> findAll() {
        try {
            List<Zona> zonas = this.zonaRepository.findAll();
            return new ResponseEntity<List<Zona>>(zonas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
