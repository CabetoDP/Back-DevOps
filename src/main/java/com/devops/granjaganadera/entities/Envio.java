package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Envios")
public class Envio {
    @Id
    @OneToOne
    public Pedido idEnvio;
    public LocalDate fechaEntrega;
    public String direccionEntrega;

    public Envio(){
        
    }
}
