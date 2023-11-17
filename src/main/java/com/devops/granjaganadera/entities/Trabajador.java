package com.devops.granjaganadera.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "Trabajadores")
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idTrabajador;
    public String primerNombre, primerApellido, sexo, ciudadResidencia;
    public int cedula, salario;
    public LocalDate fechaNacimiento;

    public Trabajador(){
        
    }
}
