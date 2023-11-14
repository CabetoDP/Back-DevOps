package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Zonas")
public class Zona {
    @Id
    long idZona;
    String nombreZona;

    public Zona(){
        
    }
}
