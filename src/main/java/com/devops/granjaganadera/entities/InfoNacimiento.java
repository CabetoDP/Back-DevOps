package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "InfoNacimientos")
public class InfoNacimiento {
    @Id
    public long idNacimiento;
    @ManyToOne
    public Animal idAnimal;
    public String condicionCria, observaciones;
    public float pesoInicial;
    
    public InfoNacimiento(){
        
    }
}
