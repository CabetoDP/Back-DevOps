package com.devops.granjaganadera.entities;

import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
@Table (name = "Pedidos")
public class Pedido {
    @Id
    public long idPedido;
    public LocalDate fechaPedido, fechaEntrega;
    public String estado, direccionEntrega;
    public boolean pagoPendiente;
    
    
    public Pedido(){
        
    }
    
    public long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(long idPedido) {
        this.idPedido = idPedido;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

}
