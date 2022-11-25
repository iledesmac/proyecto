package com.prueba.proyecto.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.prueba.proyecto.models.Movimientos;

@Repository
public interface MovimientosRepository extends CrudRepository<Movimientos, Long> {

}
