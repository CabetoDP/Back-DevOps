package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.HistorialCargos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHistorialCargosRepository extends JpaRepository<HistorialCargos, Long>{
    
}