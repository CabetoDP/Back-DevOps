package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.SeguimientoCalidadPasto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISeguimientoCalidadPastoRepository extends JpaRepository<SeguimientoCalidadPasto, Long> {
    
}
