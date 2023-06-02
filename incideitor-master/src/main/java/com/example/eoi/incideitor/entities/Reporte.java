package com.example.eoi.incideitor.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private int categoria;
    private String descripcion;

    @ManyToOne
    private Incidencia incidencia;

    @ManyToOne
    private Usuario usuario;

}
