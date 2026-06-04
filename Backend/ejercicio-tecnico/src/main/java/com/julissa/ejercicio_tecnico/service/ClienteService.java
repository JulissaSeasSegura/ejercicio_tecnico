package com.julissa.ejercicio_tecnico.service;

import com.julissa.ejercicio_tecnico.model.Cliente;
import com.julissa.ejercicio_tecnico.repository.ClienteRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente crearCliente(Cliente cliente) {

        cliente.setUsuarioCreacion("ADMIN");
        cliente.setFechaCreacion(LocalDateTime.now());

        return clienteRepository.save(cliente);
    }

}