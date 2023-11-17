package com.devops.granjaganadera.repositories.contrats;
import com.devops.granjaganadera.entities.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICargoRepository extends JpaRepository<Cargo, Long>{
    
}
