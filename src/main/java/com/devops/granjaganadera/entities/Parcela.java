package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Parcelas")
public class Parcela {
    @Id
    public long idParcela;
    @ManyToOne
    public Zona idZona;
    public float area;
    public String unidadMedida;

    public Parcela(){
        
    }
}
