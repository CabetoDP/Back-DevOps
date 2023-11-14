package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Plantaciones")
public class Plantacion {
    @Id
    long idPlantacion;
    @ManyToOne
    Parcela idParcela;
    @ManyToOne
    Recurso idRecurso;
    LocalDate fechaPlantacion, fechaCosecha;
    
    public Plantacion(){
        
    }
}
