package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Envios")
public class Envio {
    @Id
    @ManyToOne
    Pedido idEnvio;
    LocalDate fechaEntrega;
    String direccionEntrega;

    public Envio(){
        
    }
}
