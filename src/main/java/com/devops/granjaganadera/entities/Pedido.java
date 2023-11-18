package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Pedidos")
public class Pedido {
    @Id
    public long idPedido;
    public LocalDate fechaPedido, fechaEntrega;
    public String estado, direccionEntrega;
    public boolean pagoPendiente;
    
    
    public Pedido(){
        
    }
}
