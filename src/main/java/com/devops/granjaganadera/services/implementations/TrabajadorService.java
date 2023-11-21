package com.devops.granjaganadera.services.implementations;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.ITrabajadorRepository;
import com.devops.granjaganadera.services.contracts.ITrabajadorService;

@Service
public class TrabajadorService implements ITrabajadorService {

    @Autowired
    private ITrabajadorRepository trabajadorRepository;

    @Override
    public ResponseEntity<Trabajador> create(Trabajador trabajador) {
        try {
          
            Trabajador trabajadorSaved = this.trabajadorRepository.save(trabajador);
            return new ResponseEntity<Trabajador>(trabajadorSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Trabajador>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Trabajador> show(long id) {
        Trabajador trabajador = this.trabajadorRepository.mostrar(id);
        return new ResponseEntity<Trabajador>(trabajador, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Trabajador> update(Trabajador trabajador) {
        try {
            Trabajador trabajadorUpdated = this.trabajadorRepository.save(trabajador);
            return new ResponseEntity<Trabajador>(trabajadorUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Trabajador>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.trabajadorRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<Trabajador>> findAll() {
        try {
            List<Trabajador> trabajadores = this.trabajadorRepository.findAll();
            return new ResponseEntity<List<Trabajador>>(trabajadores, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity <List<Map<String, Object>>> obtenerInformacionTrabajadores(){
        List<Map<String, Object>> trabajadores = this.trabajadorRepository.obtenerInformacionTrabajadores();
            return new ResponseEntity<List<Map<String, Object>>>(trabajadores, HttpStatus.OK);
    }

    @Override
    public ResponseEntity <List<Map<String, Object>>> obtenerInformacionTrabajadoresConHistorial(){
        List<Map<String, Object>> trabajadores = this.trabajadorRepository.obtenerInformacionTrabajadoresConHistorial();
        return new ResponseEntity<List<Map<String, Object>>>(trabajadores, HttpStatus.OK);
    }

    @Override
    public ResponseEntity <List<Map<String, Object>>> obtenerCertificacionesTrabajadores(){
        List<Map<String, Object>> trabajadores = this.trabajadorRepository.obtenerCertificacionesTrabajadores();
        return new ResponseEntity<List<Map<String, Object>>>(trabajadores, HttpStatus.OK);
    }

    @Override
    public ResponseEntity <List<Map<String, Object>>> obtenerPermisosTrabajadores(){
        List<Map<String, Object>> trabajadores = this.trabajadorRepository.obtenerPermisosTrabajadores();
        return new ResponseEntity<List<Map<String, Object>>>(trabajadores, HttpStatus.OK);
    }

}