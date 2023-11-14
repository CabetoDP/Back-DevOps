package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Partos")
public class Parto {
    @Id
    long idParto;
    @ManyToOne
    Animal idMadre;
    @ManyToOne
    Animal idPadre;
    
    public Parto(){
        
    }
}
