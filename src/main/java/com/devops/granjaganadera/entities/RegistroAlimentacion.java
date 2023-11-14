package com.devops.granjaganadera.entities;

import java.time.LocalDateTime;
import jakarta.persistence.*;

@Entity
@Table (name = "RegistrosAlimentacion")
public class RegistroAlimentacion {
    @Id
    long idAlimentacion;
    @ManyToOne
    Animal idAnimal;
    LocalDateTime fechaYhoraAlimentado;
    float cantidadAlimento, cantidadAgua; 
    String unidadMedidadAlimento, tipoAlimento, unidadMedidaAgua;
    
    public RegistroAlimentacion(){
        
    }
}
