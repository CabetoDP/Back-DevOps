package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Productos")
public class Producto {
    @Id
    long idProducto;
    String nombreProducto, categoria, unidadMedida;
    int precioUnitario;
    
    public Producto(){
        
    }
}
