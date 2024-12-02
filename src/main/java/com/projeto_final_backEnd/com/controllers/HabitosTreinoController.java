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

import com.projeto_final_backEnd.com.entities.HabitosTreino;
import com.projeto_final_backEnd.com.services.HabitosTreinoService;

@RestController
@RequestMapping(value = "/habitostreino")
public class HabitosTreinoController {
	
	@Autowired
	private HabitosTreinoService service;
	
	@GetMapping
	public List<HabitosTreino> getAllHabitos () {
		return service.getAllHabitos();
	}
	
	@GetMapping(value = "/{id_habitos}")
	public ResponseEntity<HabitosTreino> getByIdHabitos(@PathVariable Long id_habitos) {
		Optional<HabitosTreino> habitostreino = service.getByIdHabitos(id_habitos);
		return habitostreino.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public String saveHabitosTreino (@RequestBody HabitosTreino habitosTreino) {
		return service.saveHabitosTreino(habitosTreino);
	}
	
	@PutMapping (value = "/{id_habitos}")
	public ResponseEntity<String> editHabitosTreino (@PathVariable Long id_habitos, @RequestBody HabitosTreino habitosTreino) {
		String response = service.editHabitosTreino(id_habitos, habitosTreino);
		return ResponseEntity.status(200).body(response);
	}
	
	@DeleteMapping(value = "/{id_habitos}")
	public ResponseEntity<Void> deleteHabitosTreino (@PathVariable Long id_habitos) {
		service.deletehabitosTreino(id_habitos);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	
	
}
