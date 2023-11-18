package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ITrabajadorRepository extends JpaRepository<Trabajador, Long>{
    
    @Query(value = "SELECT * FROM Trabajadores WHERE id = :id", nativeQuery = true)
    public Trabajador mostrar(@Param("id") long id);

}