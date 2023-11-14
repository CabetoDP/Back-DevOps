package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Pastoreos")
public class Pastoreo {
    @Id
    long idPastoreo;
    @ManyToOne
    Animal idAnimal;
    @ManyToOne
    Parcela idParcela;
    LocalDate fechaPastoreo;
    float horasPastoreo;
    String observaciones;
    
    public Pastoreo(){
        
    }
}
