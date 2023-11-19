package com.devops.granjaganadera.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "HistorialesCargos")
public class HistorialCargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idHistorialCargo;
    @ManyToOne
    public Trabajador idTrabajador;
    @ManyToOne
    public Cargo idCargo;
    public LocalDate fechaInicio;
    public LocalDate fechaFin;

    public HistorialCargo(){
        
    }
}
