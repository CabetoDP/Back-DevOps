package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosSignosVitales")
public class RegistroSignosVitalles {
    @Id
    long idRegistroSingnoVital;
    @ManyToOne
    Animal idAnimal;
    LocalDate fechaRegistro;
    float pesoEnChequeo, pulso, temperaturaCorporal, frecuenciaRespiratoria, frecuenciaCardiaca, hemoglobina, hematocrito;
    
    public RegistroSignosVitalles(){

    }
}
