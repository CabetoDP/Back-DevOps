package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.Permiso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPermisoRepository extends JpaRepository<Permiso, Long> {
    
}
