package com.prueba.proyecto.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.prueba.proyecto.models.Cuenta;
import com.prueba.proyecto.services.CuentaService;

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
@RequestMapping("/cuentas")
public class CuentaController {
	
	@Autowired
	CuentaService cuentaService;
	
	@GetMapping()
	public ArrayList<Cuenta> obtener(){
		return cuentaService.obtener();	
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Cuenta> obtenerPorId(@PathVariable("id") Long id){
		return cuentaService.obtenerPorId(id);
	}
	
	@PostMapping()
	public Cuenta guardar(@RequestBody Cuenta cliente) {
		return cuentaService.guardar(cliente);
	}
	
	@DeleteMapping(path = "/{id}")
	public boolean eliminarPorId(@PathVariable("id") Long id){
		return cuentaService.eliminar(id);
	}

}
