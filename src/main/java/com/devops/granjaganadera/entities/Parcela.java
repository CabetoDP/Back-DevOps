package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Parcelas")
public class Parcela {
    @Id
    long idParcela;
    @ManyToOne
    Zona idZona;
    float area;
    String unidadMedida;

    public Parcela(){
        
    }
}
