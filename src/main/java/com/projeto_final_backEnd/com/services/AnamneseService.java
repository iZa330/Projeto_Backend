package com.projeto_final_backEnd.com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_final_backEnd.com.entities.Anamnese;
import com.projeto_final_backEnd.com.repositories.AnamneseRepository;

@Service
public class AnamneseService {

	@Autowired
	private AnamneseRepository repository;
	
	public List<Anamnese>getAllAnamnese(){
		return repository.findAll();
	}
	
	public Optional<Anamnese> getByIdAnamnese(Long id_anamnese) {
		return repository.findById(id_anamnese);
	}
	
	
	public String saveAnamnese(Anamnese anamnese) {
		   repository.save(anamnese);
		return "Anamnese salva com sucesso!";
	}
	
	public void deleteAnamnese(Long id_anamnese) {
		repository.deleteById(id_anamnese);
	}
	

}
