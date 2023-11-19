package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.Pastoreo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPastoreoRepository extends JpaRepository<Pastoreo, Long> {
    
}
