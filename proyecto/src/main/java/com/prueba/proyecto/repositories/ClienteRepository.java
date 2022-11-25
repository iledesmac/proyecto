package com.prueba.proyecto.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.prueba.proyecto.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
	

}
