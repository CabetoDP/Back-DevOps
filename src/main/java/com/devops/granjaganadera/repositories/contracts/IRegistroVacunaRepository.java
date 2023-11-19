package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.RegistroVacuna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegistroVacunaRepository extends JpaRepository<RegistroVacuna, Long> {
    
}
