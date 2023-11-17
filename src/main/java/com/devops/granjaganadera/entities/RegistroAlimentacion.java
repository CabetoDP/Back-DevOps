package com.devops.granjaganadera.entities;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosAlimentacion")
public class RegistroAlimentacion {
    @Id
    public long idAlimentacion;
    @ManyToOne
    public Animal idAnimal;
    public LocalDateTime fechaYhoraAlimentado;
    public float cantidadAlimento, cantidadAgua; 
    public String unidadMedidadAlimento, tipoAlimento, unidadMedidaAgua;
    
    public RegistroAlimentacion(){
        
    }
}
