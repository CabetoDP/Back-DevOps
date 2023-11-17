package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Certificiones")
public class Certificacion {
    @Id
    public Long idCertificacion;
    @ManyToOne
    public Trabajador idTrabajador;
    public String titulo, institucion, descripcion;
    public LocalDate fechaAdquisicion;


    
    public Certificacion(){

    }
}
