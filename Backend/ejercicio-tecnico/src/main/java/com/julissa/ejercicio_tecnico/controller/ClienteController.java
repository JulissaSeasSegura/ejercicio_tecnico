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
import jakarta.validation.Valid;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/clientes")
@Tag(name = "Clientes", description = "Operaciones relacionadas con la gestión de clientes.")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Operation(summary = "Listar clientes", description = "Obtiene todos los clientes registrados.")
    @GetMapping
    public List<Cliente> getClientes() {
        return clienteService.listarClientes();
    }

    @Operation(summary = "Buscar el cliente por ID", description = "Obtiene un cliente registrado mediante su identificador.")
    @GetMapping("/{id}")
    public Optional<Cliente> getCliente(@PathVariable Long id) {
        return clienteService.buscarClientePorId(id);
    }

    @Operation(summary = "Crear cliente", description = "Registra un nuevo cliente.")
    @PostMapping
    public Cliente postCliente(@Valid @RequestBody Cliente cliente) {
        return clienteService.crearCliente(cliente);
    }

}