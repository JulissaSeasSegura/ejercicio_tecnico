package com.julissa.ejercicio_tecnico.repository;

import com.julissa.ejercicio_tecnico.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}