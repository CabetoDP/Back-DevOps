package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Permisos")
public class Permiso {
    @Id
    long idPermiso;
    @ManyToOne
    Trabajador idTrabajador;
    String motivo, estado;
    LocalDate fechaPeticion, fechaRevision, fechaVigenciaLimite;
    
    public Permiso(){
        
    }
}
