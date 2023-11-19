package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.RegistroSignosVitales;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegistroSignosVitalesRepository extends JpaRepository<RegistroSignosVitales, Long> {
    
}
