package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.Plantacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPlantacionRepository extends JpaRepository<Plantacion, Long> {
    
}
