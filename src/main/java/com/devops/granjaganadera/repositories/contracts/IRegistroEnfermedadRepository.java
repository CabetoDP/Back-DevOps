package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.RegistroEnfermedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegistroEnfermedadRepository extends JpaRepository<RegistroEnfermedad, Long> {
    
}