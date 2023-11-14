package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "SeguimientoCalidadPasto")
public class SeguimientoCalidadPasto {
    @Id
    long idSeguimientoCalidadPasto;
    @ManyToOne
    Parcela idParcela;
    LocalDate fechaMuestreo;
    float nivelProteina, nivelFibra, nivelEnergia, nivelHumedad, observacion;
    public SeguimientoCalidadPasto(){

    }
}
