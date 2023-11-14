package com.devops.granjaganadera.entities;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "Trabajadores")
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTrabajador;
    private String primerNombre, primerApellido, sexo, ciudadResidencia;
    private int cedula, salario;
    private LocalDate fechaNacimiento;

    public Trabajador(){
        
    }
}
