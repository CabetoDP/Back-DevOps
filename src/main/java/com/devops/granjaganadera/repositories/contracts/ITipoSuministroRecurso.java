package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.TipoRecurso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoSuministroRecurso extends JpaRepository<TipoRecurso, Long>{
    
}
