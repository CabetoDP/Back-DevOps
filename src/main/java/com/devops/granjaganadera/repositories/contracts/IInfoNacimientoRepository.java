package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.InfoNacimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInfoNacimientoRepository extends JpaRepository<InfoNacimiento, Long> {
    
}
