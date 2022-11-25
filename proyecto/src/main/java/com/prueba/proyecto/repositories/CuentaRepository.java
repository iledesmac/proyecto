package com.prueba.proyecto.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.prueba.proyecto.models.Cuenta;

@Repository
public interface CuentaRepository extends CrudRepository<Cuenta, Long> {

}
