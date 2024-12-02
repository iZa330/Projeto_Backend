 package com.projeto_final_backEnd.com.repositories;






import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.projeto_final_backEnd.com.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    @Query("SELECT c FROM Cliente c ORDER BY c.id_cliente DESC")
    Optional<Cliente> findTopByOrderById_clienteDesc();
}


