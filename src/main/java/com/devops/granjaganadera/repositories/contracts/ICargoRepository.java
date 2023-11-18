package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICargoRepository extends JpaRepository<Cargo, Long>{
    
    @Query(value = "SELECT * FROM Animales WHERE id_animal = :id", nativeQuery = true)
    public Cargo mostrar(@Param("id") long id);

}
