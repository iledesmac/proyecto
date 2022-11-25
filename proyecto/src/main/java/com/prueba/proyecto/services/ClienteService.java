package com.prueba.proyecto.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.proyecto.models.Cliente;
import com.prueba.proyecto.repositories.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	ClienteRepository clienteRepository;
	
	public ArrayList<Cliente> obtener(){
		return (ArrayList<Cliente>) clienteRepository.findAll();
	}
	
	public Cliente guardar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Optional<Cliente> obtenerPorId(Long id){
		return clienteRepository.findById(id);
	}
	
	public boolean eliminar(Long id) {
		try {
			clienteRepository.deleteById(id);
			return true;
		}catch(Exception err) {
			return false;
		}
	}
}
