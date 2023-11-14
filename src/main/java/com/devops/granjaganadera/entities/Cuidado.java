package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Cuidados")
public class Cuidado {
    @Id
    long idCuidado;
    @ManyToOne
    Parcela idParcela;
    String tipoCuidado, subcategoria, unidadMedida;
    float cantidad;
    LocalDate fechaCuidado;

    public Cuidado() {
        
    }
}
