package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "InfoNacimientos")
public class InfoNacimiento {
    @Id
    long idNacimiento;
    @ManyToOne
    Animal idAnimal;
    String condicionCria, observaciones;
    float pesoInicial;
    
    public InfoNacimiento(){
        
    }
}
