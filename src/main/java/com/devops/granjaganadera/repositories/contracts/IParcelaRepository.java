package com.devops.granjaganadera.repositories.contracts;

import com.devops.granjaganadera.entities.Parcela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IParcelaRepository extends JpaRepository<Parcela, Long> {
    
}
