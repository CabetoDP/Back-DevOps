package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosSignosVitales")
public class RegistroSignosVitales {
    @Id
    public long idRegistroSingnoVital;
    @ManyToOne
    public Animal idAnimal;
    public LocalDate fechaRegistro;
    public float pesoEnChequeo, pulso, temperaturaCorporal, frecuenciaRespiratoria, frecuenciaCardiaca, hemoglobina, hematocrito;
    
    public RegistroSignosVitales(){

    }
}
