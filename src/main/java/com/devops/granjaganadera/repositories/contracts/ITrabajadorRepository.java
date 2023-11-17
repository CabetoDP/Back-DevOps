package com.devops.granjaganadera.repositories.contrats;
import com.devops.granjaganadera.entities.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITrabajadorRepository extends JpaRepository<Trabajador, Long>{
    
}
