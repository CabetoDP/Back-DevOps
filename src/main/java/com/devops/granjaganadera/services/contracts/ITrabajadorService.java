package com.devops.granjaganadera.services.contracts;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Trabajador;


public interface ITrabajadorService {

    public ResponseEntity<Trabajador> create(Trabajador trabajador);

    public ResponseEntity<Trabajador> show(long id);

    public ResponseEntity<Trabajador> update(Trabajador trabajador);

    public ResponseEntity<Boolean> delete(Long id);
    
    public ResponseEntity<List<Trabajador>> findAll();

    public ResponseEntity <List<Map<String, Object>>> obtenerInformacionTrabajadores();

    public ResponseEntity <List<Map<String, Object>>> obtenerInformacionTrabajadoresConHistorial();

    public ResponseEntity <List<Map<String, Object>>> obtenerCertificacionesTrabajadores();

    public ResponseEntity <List<Map<String, Object>>> obtenerPermisosTrabajadores();

    

}
