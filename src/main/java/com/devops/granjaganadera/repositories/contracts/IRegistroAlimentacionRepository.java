package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.RegistroAlimentacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRegistroAlimentacionRepository extends JpaRepository<RegistroAlimentacion, Long> {
    
}
