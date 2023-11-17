package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "ContenidoPedido")
public class ContenidoPedido {
    @Id
    public Long id;
    @ManyToOne
    public Producto Producto;
    @ManyToOne
    public Pedido idPedido;
    public float cantidad;
    
    public ContenidoPedido(){

    }
}
