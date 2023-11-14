package com.devops.granjaganadera.repositories.contrats;
import com.devops.granjaganadera.entities.RegistroInventario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegistroInventarioRepository extends JpaRepository<RegistroInventario, Long>{
    
}