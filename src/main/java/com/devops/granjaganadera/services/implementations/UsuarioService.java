package com.devops.granjaganadera.services.implementations;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.devops.granjaganadera.entities.*;
import com.devops.granjaganadera.repositories.contracts.IUsuarioRepository;
import com.devops.granjaganadera.services.contracts.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private IUsuarioRepository usuarioRepository;

    @Override
    public ResponseEntity<Usuario> create(Usuario usuario) {
        try {
          
            Usuario usuarioSaved = this.usuarioRepository.save(usuario);
            return new ResponseEntity<Usuario>(usuarioSaved, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public ResponseEntity<Usuario> show(String correo, String contraseña) {
        Usuario usuario = this.usuarioRepository.mostrar(correo, contraseña);
        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Boolean> validate(String correo, String contraseña) {

        Boolean validacion = false;
        Usuario usuario = this.usuarioRepository.validar(correo, contraseña);

        if(usuario != null){
            validacion = true;
        }
        
        return new ResponseEntity<Boolean>(validacion, HttpStatus.OK);
    }

}