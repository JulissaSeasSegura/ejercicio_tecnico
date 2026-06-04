package com.julissa.ejercicio_tecnico.model;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre, correo, usuarioCreacion;
    private LocalDateTime fechaCreacion;

    public Cliente() {
    }

}