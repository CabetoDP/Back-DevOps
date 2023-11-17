package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Permisos")
public class Permiso {
    @Id
    public long idPermiso;
    @ManyToOne
    public Trabajador idTrabajador;
    public String motivo, estado;
    public LocalDate fechaPeticion, fechaRevision, fechaVigenciaLimite;
    
    public Permiso(){
        
    }
}
