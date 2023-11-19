package com.devops.granjaganadera.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IContenidoPedidoRepository;
import com.devops.granjaganadera.services.contracts.IContenidoPedidoService;

@Service
public class ContenidoPedidoService implements IContenidoPedidoService {

    @Autowired
    private IContenidoPedidoRepository contenidoPedidoRepository;

    @Override
    public ResponseEntity<List<ContenidoPedido>> findAll() {
        try {
            List<ContenidoPedido> contenidoPedidos = this.contenidoPedidoRepository.findAll();
            return new ResponseEntity<List<ContenidoPedido>>(contenidoPedidos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
