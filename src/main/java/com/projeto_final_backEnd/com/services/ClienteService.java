package com.projeto_final_backEnd.com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_final_backEnd.com.entities.Cliente;
import com.projeto_final_backEnd.com.repositories.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	public List<Cliente> getAllCliente(){
		return repository.findAll();
	}
	
	public Optional<Cliente> getByIdCliente(Long id_cliente){
		return repository.findById(id_cliente);
	}
	
	public String saveCliente (Cliente cliente) {
		repository.save(cliente);
		return "Cliente salvo com sucesso!";
	}
	
	public String updateCliente (Long id_cliente , Cliente cliente) {
		Cliente response = repository.findById(id_cliente).get();
		response.setNome_completo(cliente.getNome_completo());
		response.setData_nascimento(cliente.getData_nascimento());
		response.setContato_nome(cliente.getContato_nome());
		response.setContato_telefone(cliente.getContato_telefone());
		
		repository.save(response);
		return "Cliente editado com sucesso!";
	}
	
	public void deleteCliente(Long id_Cliente) {
		Cliente response = repository.findById(id_Cliente).get();
		repository.delete(response);
	}
	
}
