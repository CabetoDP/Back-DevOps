package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "DatosRendimiento")
public class DatoRendimiento {
    @Id
    long idDatoRendimiento;
    @ManyToOne
    Animal idAnimal;
    LocalDate fechaRecolecta;
    String materiaPrima, unidadMedida;
    float cantidad;

    public DatoRendimiento(){
        
    }
}
