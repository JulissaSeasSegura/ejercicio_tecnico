package com.julissa.ejercicio_tecnico.model;

import java.time.LocalDateTime;

public class Cliente {

    //Atributos
    private long id;
    private String nombre, correo, usuarioCreacion;
    private LocalDateTime fechaCreacion;

    //Constructor
    public Cliente(long id, String nombre, String correo, String usuarioCreacion, LocalDateTime fechaCreacion){
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.usuarioCreacion = usuarioCreacion;
        this.fechaCreacion = fechaCreacion;
    }
}