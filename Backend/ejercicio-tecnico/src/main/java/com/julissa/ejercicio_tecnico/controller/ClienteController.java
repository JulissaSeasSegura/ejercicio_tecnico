package com.julissa.ejercicio_tecnico.controller;

import com.julissa.ejercicio_tecnico.model.Cliente;
import com.julissa.ejercicio_tecnico.service.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    //Lista todos los clientes registrados
    @GetMapping
    public List<Cliente> getClientes() {
        return clienteService.listarClientes();
    }

    //Consulta un cliente por su identificador
    @GetMapping("/{id}")
    public Optional<Cliente> getCliente(@PathVariable Long id) {
        return clienteService.buscarClientePorId(id);
    }

    //Crea un nuevo cliente
    @PostMapping
    public Cliente postCliente(@RequestBody Cliente cliente) {
        return clienteService.guardarCliente(cliente);
    }

}