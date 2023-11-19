package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.RegistroTratamiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegistroTratamientoRepository extends JpaRepository<RegistroTratamiento, Long> {
    
}
