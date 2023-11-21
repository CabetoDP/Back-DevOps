package com.devops.granjaganadera.repositories.contracts;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devops.granjaganadera.entities.Animal;

public interface IAnimalRepository extends JpaRepository<Animal, Long>{

    @Query(value = "SELECT * FROM Animales WHERE id_animal = :id", nativeQuery = true)
    public Animal mostrar(@Param("id") long id);

}