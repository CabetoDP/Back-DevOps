package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Facturas")
public class Factura {
    @Id
    @OneToOne
    public Envio idFactura;
    
    public Factura(){
        
    }
}
