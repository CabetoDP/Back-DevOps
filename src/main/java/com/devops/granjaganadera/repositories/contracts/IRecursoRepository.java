package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.Recurso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRecursoRepository extends JpaRepository<Recurso, Long>{
    
}
