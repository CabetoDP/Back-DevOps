package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "ContenidoPedido")
public class ContenidoPedido {
    @Id
    Long id;
    @ManyToOne
    Producto Producto;
    @ManyToOne
    Pedido idPedido;
    float cantidad;
    
    public ContenidoPedido(){

    }
}
