package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Partos")
public class Parto {
    @Id
    public long idParto;
    @ManyToOne
    public Animal idMadre;
    @ManyToOne
    public Animal idPadre;
    @OneToOne
    public Animal idHijo;
    public Parto(){
        
    }
}
