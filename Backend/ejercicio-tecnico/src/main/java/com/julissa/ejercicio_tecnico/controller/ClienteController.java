package com.julissa.ejercicio_tecnico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    //Lista todos los clientes registrados
    @GetMapping
    public String getClientes(@RequestParam String param) {
        return new String();
    }

    //Consulta un cliente por su identificador
    @GetMapping("/{id}")
    public String getCliente(@RequestParam String param) {
        return new String();
    }
    
    //Crea un nuevo cliente
    @PostMapping
    public String postCliente(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
}