package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "Productos")
public class Producto {
    @Id
    public long idProducto;
    public String nombreProducto, categoria, unidadMedida;
    public int precioUnitario;
    
    public Producto(){
        
    }
}
