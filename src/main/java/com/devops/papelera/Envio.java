package com.devops.papelera;

import java.time.LocalDate;

import com.devops.granjaganadera.entities.Pedido;

import jakarta.persistence.*;

//@Entity
//@Table (name = "Envios")
public class Envio {
    //@Id
    //@OneToOne
    public Pedido idEnvio;
    public LocalDate fechaEntrega;
    public String direccionEntrega;

    public Envio(){
        
    }
}
