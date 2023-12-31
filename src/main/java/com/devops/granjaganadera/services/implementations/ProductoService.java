package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IProductoRepository;
import com.devops.granjaganadera.services.contracts.IProductoService;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository productoRepository;

    @Override
    public ResponseEntity<Producto> create(Producto producto) {
        try {
          
            Producto productoSaved = this.productoRepository.save(producto);
            return new ResponseEntity<Producto>(productoSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Producto>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Producto> show(long id) {
        Producto producto = this.productoRepository.mostrar(id);
        return new ResponseEntity<Producto>(producto, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Producto> update(Producto producto) {
        try {
            Producto productoUpdated = this.productoRepository.save(producto);
            return new ResponseEntity<Producto>(productoUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Producto>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.productoRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<Producto>> findAll() {
        try {
            List<Producto> productos = this.productoRepository.findAll();
            return new ResponseEntity<List<Producto>>(productos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}