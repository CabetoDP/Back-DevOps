package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosEnfermedades")
public class RegistroEnfermedades {
    @Id
    public long idRegistroEnfermedad;
    @ManyToOne
    public Animal idAnimal;
    public String nombreEnfermedad, diagnostico, veterinario;
    public LocalDate fechaInicio, fechaFin;

    public RegistroEnfermedades(){
        
    }
}