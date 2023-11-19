package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IPedidoRepository;
import com.devops.granjaganadera.services.contracts.IPedidoService;

@Service
public class PedidoService implements IPedidoService {

    @Autowired
    private IPedidoRepository pedidoRepository;

    @Override
    public ResponseEntity<Pedido> create(Pedido pedido) {
        try {
          
            Pedido pedidoSaved = this.pedidoRepository.save(pedido);
            return new ResponseEntity<Pedido>(pedidoSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Pedido> show(long id) {
        Pedido pedido = this.pedidoRepository.mostrar(id);
        return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Pedido> update(Pedido pedido) {
        try {
            Pedido pedidoUpdated = this.pedidoRepository.save(pedido);
            return new ResponseEntity<Pedido>(pedidoUpdated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Pedido>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Boolean> delete(Long id) {
        try {
            this.pedidoRepository.deleteById(id);
            return new ResponseEntity<Boolean>(true, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Boolean>(false, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<List<Pedido>> findAll() {
        try {
            List<Pedido> pedidos = this.pedidoRepository.findAll();
            return new ResponseEntity<List<Pedido>>(pedidos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
