package com.devops.granjaganadera.repositories.contrats;
import com.devops.granjaganadera.entities.Recurso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISuministroRepository extends JpaRepository<Recurso, Long>{
    
}
