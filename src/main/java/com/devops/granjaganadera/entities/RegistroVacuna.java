package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosVacuna")
public class RegistroVacuna {
    @Id
    public long idRegistroVacuna;
    @ManyToOne 
    public Animal idAnimal;
    public String nombreVacuna, veterinario;
    public LocalDate fechaAplicación;
    
    public RegistroVacuna(){

    }
}
