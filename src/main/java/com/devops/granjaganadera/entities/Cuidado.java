package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Cuidados")
public class Cuidado {
    @Id
    public long idCuidado;
    @ManyToOne
    public Parcela idParcela;
    public String tipoCuidado, subcategoria, unidadMedida;
    public float cantidad;
    public LocalDate fechaCuidado;

    public Cuidado() {
        
    }
}
