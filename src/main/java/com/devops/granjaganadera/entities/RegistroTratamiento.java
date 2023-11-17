package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosTratamiento")
public class RegistroTratamiento {
    @Id
    public long idTratamiento;
    @ManyToOne
    public Animal idAnimal;
    public String nombreTratamiento, veterinario;
    public LocalDate fechaInicio, fechaFin;

    public RegistroTratamiento(){

    }
}
