package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Recursos")
public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRecurso;
    @ManyToOne
    private TipoRecurso idTipoRecurso;
    private String nombre, descripcion, unidadMedida;
    private float cantidadMin;
    private float precio;

    public Recurso(){

    }
}
