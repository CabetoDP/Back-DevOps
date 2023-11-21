package com.devops.granjaganadera.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.devops.Requests.IdRequest;
import com.devops.Requests.UsuarioRequest;
import com.devops.granjaganadera.entities.Usuario;
import com.devops.granjaganadera.services.contracts.IUsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/create")
    private  ResponseEntity<Usuario> createUsuario(@RequestBody Usuario usuario) {
        return this.usuarioService.create(usuario);
    }

    @PostMapping("/show")
    private ResponseEntity<Usuario> show(@RequestBody UsuarioRequest usuario) {
        return this.usuarioService.show(usuario.correo, usuario.contraseña);
    }

    @PostMapping("/validate")
    private ResponseEntity<Boolean> validateUsuario(@RequestBody UsuarioRequest usuario) {
        return this.usuarioService.validate(usuario.correo, usuario.contraseña);
    }
}