package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.Zona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IZonaRepository extends JpaRepository<Zona, Long> {
    
}
