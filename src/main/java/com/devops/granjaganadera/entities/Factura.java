package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Facturas")
public class Factura {
    @Id
    @ManyToOne
    Envio idFactura;
    
    public Factura(){
        
    }
}
