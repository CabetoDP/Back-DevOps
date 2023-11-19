package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IPlantacionRepository;
import com.devops.granjaganadera.services.contracts.IPlantacionService;

@Service
public class PlantacionService implements IPlantacionService {

    @Autowired
    private IPlantacionRepository plantacionRepository;

    @Override
    public ResponseEntity<List<Plantacion>> findAll() {
        try {
            List<Plantacion> plantaciones = this.plantacionRepository.findAll();
            return new ResponseEntity<List<Plantacion>>(plantaciones, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
