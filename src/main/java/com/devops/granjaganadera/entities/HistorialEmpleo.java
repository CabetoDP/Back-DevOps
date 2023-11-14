package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "HistorialesEmpleos")
public class HistorialEmpleo {
    @Id
    public long idEmpleo;
    @ManyToOne
    public Trabajador idTrabajador;
    public String cargo, jefeSuperior;
    public LocalDate fechaEntrada, fechaSalida;
    public int salario; 

    public HistorialEmpleo(){
        
    }
}
