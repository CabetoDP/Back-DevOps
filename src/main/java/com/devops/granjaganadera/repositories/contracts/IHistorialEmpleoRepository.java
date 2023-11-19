package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.HistorialEmpleo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHistorialEmpleoRepository extends JpaRepository<HistorialEmpleo, Long> {
    // Puedes agregar métodos específicos del repositorio si es necesario
}
