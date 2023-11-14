package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Pedidos")
public class Pedido {
    @Id
    long idPedido;
    LocalDate fechaPedido;
    String estado;
    boolean pagoPendiente;
    
    public Pedido(){
        
    }
}
