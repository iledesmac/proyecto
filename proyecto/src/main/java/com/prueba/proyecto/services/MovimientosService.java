package com.prueba.proyecto.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.proyecto.models.Movimientos;
import com.prueba.proyecto.repositories.MovimientosRepository;

@Service
public class MovimientosService {
	@Autowired
	MovimientosRepository movimientosRepository;
	
	public ArrayList<Movimientos> obtener(){
		return (ArrayList<Movimientos>) movimientosRepository.findAll();
	}
	
	public Movimientos guardar(Movimientos movimientos) {
		return movimientosRepository.save(movimientos);
	}
	
	public Optional<Movimientos> obtenerPorId(Long id){
		return movimientosRepository.findById(id);
	}
	
	public boolean eliminar(Long id) {
		try {
			movimientosRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
}