package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Mantenimiento")
public class Mantenimiento {
    @Id
    long idMantenimiento;
    @ManyToOne
    Zona idZona;
    LocalDate fechaIncio, fechaFin;
    String tipoMantenimiento;
    public Mantenimiento(){
        
    }
}
