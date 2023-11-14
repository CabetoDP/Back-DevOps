package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosEnfermedades")
public class RegistroEnfermedades {
    @Id
    long idRegistroEnfermedad;
    @ManyToOne
    Animal idAnimal;
    String nombreEnfermedad, diagnostico, veterinario;
    LocalDate fechaInicio, fechaFin;

    public RegistroEnfermedades(){
        
    }
}