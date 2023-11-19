package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.Cuidado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICuidadoRepository extends JpaRepository<Cuidado, Long>{
    
}
