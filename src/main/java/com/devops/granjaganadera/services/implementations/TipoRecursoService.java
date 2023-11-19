package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.ITipoRecursoRepository;
import com.devops.granjaganadera.services.contracts.ITipoRecursoService;

@Service
public class TipoRecursoService implements ITipoRecursoService {

    @Autowired
    private ITipoRecursoRepository tipoRecursoRepository;

    @Override
    public ResponseEntity<List<TipoRecurso>> findAll() {
        try {
            List<TipoRecurso> tipoRecursos = this.tipoRecursoRepository.findAll();
            return new ResponseEntity<List<TipoRecurso>>(tipoRecursos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
