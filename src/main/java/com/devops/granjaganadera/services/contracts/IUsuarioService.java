package com.devops.granjaganadera.services.contracts;

import org.springframework.http.ResponseEntity;

import com.devops.granjaganadera.entities.Usuario;


public interface IUsuarioService {
    
    public ResponseEntity<Usuario> create(Usuario usuario);

    public ResponseEntity<Usuario> show(String correo, String contraseña);

    public ResponseEntity<Boolean> validate(String correo, String contraseña);
}
