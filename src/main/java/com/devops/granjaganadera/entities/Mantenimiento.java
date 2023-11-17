package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Mantenimiento")
public class Mantenimiento {
    @Id
    public long idMantenimiento;
    @ManyToOne
    public Zona idZona;
    public LocalDate fechaIncio, fechaFin;
    public String tipoMantenimiento;
    public Mantenimiento(){
        
    }
}
