package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Recursos")
public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idRecurso;
    @ManyToOne
    public TipoRecurso idTipoRecurso;
    public String nombre, descripcion, unidadMedida;
    public float cantidadMin;
    public float precio;

    public Recurso(){

    }
}
