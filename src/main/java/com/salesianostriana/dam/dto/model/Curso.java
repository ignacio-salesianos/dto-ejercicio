package com.salesianostriana.dam.dto.model;

import lombok.*;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Builder
public class Curso {

    private Long id;

    private String nombre;
    private String tipo;
    private String tutor;
    private String aula;
}
