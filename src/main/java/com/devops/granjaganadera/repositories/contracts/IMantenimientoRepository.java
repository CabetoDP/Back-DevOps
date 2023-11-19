package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMantenimientoRepository extends JpaRepository<Mantenimiento, Long> {
    
}
