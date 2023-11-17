package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "SeguimientoCalidadPasto")
public class SeguimientoCalidadPasto {
    @Id
    public long idSeguimientoCalidadPasto;
    @ManyToOne
    public Parcela idParcela;
    public LocalDate fechaMuestreo;
    public float nivelProteina, nivelFibra, nivelEnergia, nivelHumedad, observacion;
    public SeguimientoCalidadPasto(){

    }
}
