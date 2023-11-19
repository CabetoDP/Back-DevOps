package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IParcelaRepository;
import com.devops.granjaganadera.services.contracts.IParcelaService;

@Service
public class ParcelaService implements IParcelaService {

    @Autowired
    private IParcelaRepository parcelaRepository;

    @Override
    public ResponseEntity<List<Parcela>> findAll() {
        try {
            List<Parcela> parcelas = this.parcelaRepository.findAll();
            return new ResponseEntity<List<Parcela>>(parcelas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
