package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Pastoreos")
public class Pastoreo {
    @Id
    public long idPastoreo;
    @ManyToOne
    public Animal idAnimal;
    @ManyToOne
    public Parcela idParcela;
    public LocalDate fechaPastoreo;
    public float horasPastoreo;
    public String observaciones;
    
    public Pastoreo(){
        
    }
}
