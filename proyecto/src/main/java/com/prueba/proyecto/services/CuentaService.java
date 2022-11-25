package com.prueba.proyecto.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.proyecto.models.Cuenta;
import com.prueba.proyecto.repositories.CuentaRepository;

@Service
public class CuentaService {
	@Autowired
	CuentaRepository cuentaRepository;
	
	public ArrayList<Cuenta> obtener(){
		return (ArrayList<Cuenta>) cuentaRepository.findAll();
	}
	
	public Cuenta guardar(Cuenta cuenta) {
		return cuentaRepository.save(cuenta);
	}
	
	public Optional<Cuenta> obtenerPorId(Long id){
		return cuentaRepository.findById(id);
	}
	
	public boolean eliminar(Long id) {
		try {
			cuentaRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
}
