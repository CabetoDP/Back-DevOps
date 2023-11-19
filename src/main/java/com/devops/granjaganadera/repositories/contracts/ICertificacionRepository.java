package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.Certificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICertificacionRepository extends JpaRepository<Certificacion, Long>{
    
}
