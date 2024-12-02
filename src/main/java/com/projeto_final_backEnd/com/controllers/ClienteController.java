package com.projeto_final_backEnd.com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto_final_backEnd.com.entities.Cliente;
import com.projeto_final_backEnd.com.services.ClienteService;

@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

	@Autowired
	private ClienteService service;
	
	@GetMapping
	public ResponseEntity <List<Cliente>> getAllCliente(){
		return ResponseEntity.ok(service.getAllCliente());
	}
	
	@GetMapping(value = "/{id_Cliente}")
	public ResponseEntity<Cliente> getByIdCliente(@PathVariable Long id_Cliente){
		Optional<Cliente> cliente = service.getByIdCliente(id_Cliente);
		return cliente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<String> createCliente(@RequestBody Cliente cliente){
		return ResponseEntity.ok(service.saveCliente(cliente));
	}
	
	@PutMapping(value = "/{id_Cliente}")
	public ResponseEntity<String> updateCliente(@PathVariable Long id_Cliente , @RequestBody Cliente cliente){
		String response = service.updateCliente(id_Cliente, cliente);
		return ResponseEntity.status(200).body(response);
	}
	
	@DeleteMapping(value = "/{id_Cliente}")
	public ResponseEntity<Void> deleteCliente(@PathVariable Long id_Cliente){
		service.deleteCliente(id_Cliente);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
