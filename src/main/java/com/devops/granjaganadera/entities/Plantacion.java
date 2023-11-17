package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Plantaciones")
public class Plantacion {
    @Id
    public long idPlantacion;
    @ManyToOne
    public Parcela idParcela;
    @ManyToOne
    public Recurso idRecurso;
    public LocalDate fechaPlantacion, fechaCosecha;
    
    public Plantacion(){
        
    }
}
