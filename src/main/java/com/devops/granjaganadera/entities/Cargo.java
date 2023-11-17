package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Cargos")
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idCargo;
    public String tituloCargo;
    public String descripcion;
    public String requisitos;

    public Cargo(){

    }
}


