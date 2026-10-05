package com.salesianostriana.dam.dto.dto;

import com.salesianostriana.dam.dto.model.Alumno;

public record AlumnoDto(
        String nombre,
        String apellidos,
        String email,
        String curso,
        String direccion
) {

    public static AlumnoDto of(Alumno a) {
        return new AlumnoDto(
                a.getNombre(),
                a.getApellido1() + " " + a.getApellido2(),
                a.getEmail(),
                a.getCurso().getNombre(),
                a.getDireccion().getTipoVia() + " " + a.getDireccion().getLinea1() + " "
                        + a.getDireccion().getLinea2() + ", " + a.getDireccion().getCp() + " "
                        + a.getDireccion().getPoblacion() + " (" + a.getDireccion().getProvincia() + ")"
        );
    }
}
