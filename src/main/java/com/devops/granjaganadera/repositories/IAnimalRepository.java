package com.devops.granjaganadera.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devops.granjaganadera.entities.Animal;

public interface IAnimalRepository extends JpaRepository<Animal, Long>{

    @Query(value = "SELECT * FROM Animales WHERE id = :id", nativeQuery = true)
    public Animal mostrar(@Param("id") long id);

}