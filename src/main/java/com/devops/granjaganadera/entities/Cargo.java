package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Cargos")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCargo;
    private String tituloCargo;
    private String descripcion;
    private String requisitos;

    public Cargo(){

    }
}


