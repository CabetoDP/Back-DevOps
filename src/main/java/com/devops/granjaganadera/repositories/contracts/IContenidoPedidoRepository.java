package com.devops.granjaganadera.repositories.contracts;
import com.devops.granjaganadera.entities.ContenidoPedido;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IContenidoPedidoRepository extends JpaRepository<ContenidoPedido, Long>{
    
}
