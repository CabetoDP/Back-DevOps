package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Zonas")
public class Zona {
    @Id
    public long idZona;
    public String nombreZona;

    public Zona(){
        
    }
}
