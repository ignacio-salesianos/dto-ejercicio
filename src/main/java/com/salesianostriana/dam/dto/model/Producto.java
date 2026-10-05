package com.salesianostriana.dam.dto.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Producto {

    private Long id;
    private String nombre;
    private String desc;
    private double pvp;
    private List<String> imagenes = new ArrayList<>();
    private Categoria categoria;
}
