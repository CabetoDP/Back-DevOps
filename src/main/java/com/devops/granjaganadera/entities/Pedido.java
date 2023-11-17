package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Pedidos")
public class Pedido {
    @Id
    public long idPedido;
    public LocalDate fechaPedido;
    public String estado;
    public boolean pagoPendiente;
    
    public Pedido(){
        
    }
}
