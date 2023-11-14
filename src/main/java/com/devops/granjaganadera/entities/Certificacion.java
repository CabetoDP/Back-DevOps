package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Certificiones")
public class Certificacion {
    @Id
    Long idCertificacion;
    @ManyToOne
    Trabajador idTrabajador;
    String titulo, institucion, descripcion;
    LocalDate fechaAdquisicion;


    
    public Certificacion(){

    }
}
