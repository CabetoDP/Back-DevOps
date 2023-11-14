package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosVacuna")
public class RegistroVacuna {
    @Id
    long idRegistroVacuna;
    @ManyToOne 
    Animal idAnimal;
    String nombreVacuna, veterinario;
    LocalDate fechaAplicación;
    
    public RegistroVacuna(){

    }
}
