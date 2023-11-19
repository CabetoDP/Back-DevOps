package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IPastoreoRepository;
import com.devops.granjaganadera.services.contracts.IPastoreoService;

@Service
public class PastoreoService implements IPastoreoService {

    @Autowired
    private IPastoreoRepository pastoreoRepository;

    @Override
    public ResponseEntity<List<Pastoreo>> findAll() {
        try {
            List<Pastoreo> pastoreos = this.pastoreoRepository.findAll();
            return new ResponseEntity<List<Pastoreo>>(pastoreos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
