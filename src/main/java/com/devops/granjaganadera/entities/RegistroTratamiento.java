package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosTratamiento")
public class RegistroTratamiento {
    @Id
    long idTratamiento;
    @ManyToOne
    Animal idAnimal;
    String nombreTratamiento, veterinario;
    LocalDate fechaInicio, fechaFin;

    public RegistroTratamiento(){

    }
}
