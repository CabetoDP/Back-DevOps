package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT * FROM Usuarios WHERE correo = :correo AND contraseña = :contraseña", nativeQuery = true)
    public Usuario mostrar(@Param("correo") String correo, @Param("contraseña") String contraseña);

    @Query(value = "SELECT * FROM Usuarios WHERE correo = :correo AND contraseña = :contraseña", nativeQuery = true)
    public Usuario validar(@Param("correo") String correo, @Param("contraseña") String contrañseña);
    
}
