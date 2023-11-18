package com.devops.granjaganadera.repositories.contracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.devops.granjaganadera.entities.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Long>{

    @Query(value = "SELECT * FROM Pedidos WHERE id = :id", nativeQuery = true)
    public Pedido mostrar(@Param("id") long id);
    
}
