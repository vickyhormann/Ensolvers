package com.ensolvers.ejercicio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tarea {

    private Integer idToDo;
    private String nombre;
    private boolean realizado;
}
