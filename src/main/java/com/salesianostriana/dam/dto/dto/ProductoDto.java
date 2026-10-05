package com.salesianostriana.dam.dto.dto;

import com.salesianostriana.dam.dto.model.Producto;

public record ProductoDto(
        String nombre,
        double pvp,
        String imagen,
        String categoria
) {

    public static ProductoDto of(Producto p) {
        return new ProductoDto(
                p.getNombre(),
                p.getPvp(),
                p.getImagenes().isEmpty() ? null : p.getImagenes().get(0),
                p.getCategoria().getNombre()
        );
    }
}
