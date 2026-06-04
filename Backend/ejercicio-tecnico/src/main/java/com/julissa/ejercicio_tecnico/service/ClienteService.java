package com.julissa.ejercicio_tecnico.service;

import com.julissa.ejercicio_tecnico.model.Cliente;
import com.julissa.ejercicio_tecnico.repository.ClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    //Lista todos los clientes registrados
    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    //Consulta un cliente por su identificador
    public Optional<Cliente> buscarClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    //Crea un nuevo cliente
    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

}