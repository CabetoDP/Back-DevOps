package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.HistorialCargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHistorialCargoRepository extends JpaRepository<HistorialCargo, Long>{
    
}