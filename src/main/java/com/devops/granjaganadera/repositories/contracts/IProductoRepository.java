package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProductoRepository extends JpaRepository<Producto, Long>{
    
    @Query(value = "SELECT * FROM Animales WHERE id = :id", nativeQuery = true)
    public Producto mostrar(@Param("id") long id);

}
