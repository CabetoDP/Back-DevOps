package com.devops.granjaganadera.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "RegistrosInventarios")
public class RegistroInventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idRegistroInventario;
    @ManyToOne
    public Recurso idRecurso;
    String tipoMovimiento;
    @ManyToOne
    public Trabajador idTrabajador;
    public LocalDate fechaRegistro;
    public int cantidadRegistrada;

    public RegistroInventario(){

    }
}
