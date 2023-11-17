package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "DatosRendimiento")
public class DatoRendimiento {
    @Id
    public long idDatoRendimiento;
    @ManyToOne
    public Animal idAnimal;
    public LocalDate fechaRecolecta;
    public String materiaPrima, unidadMedida;
    public float cantidad;

    public DatoRendimiento(){
        
    }
}
