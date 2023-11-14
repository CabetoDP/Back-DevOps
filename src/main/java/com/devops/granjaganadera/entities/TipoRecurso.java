package com.devops.granjaganadera.entities;
import jakarta.persistence.*;

@Entity
@Table (name = "TiposRecurso")
public class TipoRecurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTipoRecurso;
    private String tipoRecurso, subcategoria, especificaciones;

    public TipoRecurso(){

    }
}
