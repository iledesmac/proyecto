package com.prueba.proyecto.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.prueba.proyecto.models.Movimientos;
import com.prueba.proyecto.services.MovimientosService;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/movimientos")
public class MovimientosController {
	
	@Autowired
	MovimientosService movimientosService;
	
	@GetMapping()
	public ArrayList<Movimientos> obtener(){
		return movimientosService.obtener();	
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Movimientos> obtenerPorId(@PathVariable("id") Long id){
		return movimientosService.obtenerPorId(id);
	}
	
	@PostMapping()
	public Movimientos guardar(@RequestBody Movimientos movimientos) {
		return movimientosService.guardar(movimientos);
	}
	
	@DeleteMapping(path = "/{id}")
	public boolean eliminarPorId(@PathVariable("id") Long id){
		return movimientosService.eliminar(id);
	}

}
