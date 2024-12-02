package com.projeto_final_backEnd.com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_final_backEnd.com.entities.HabitosTreino;
import com.projeto_final_backEnd.com.repositories.HabitosTreinoRepository;

@Service
public class HabitosTreinoService {
	
	@Autowired
	private HabitosTreinoRepository repository;
	
	public List <HabitosTreino> getAllHabitos() {
		return repository.findAll();
	}
	
	public Optional<HabitosTreino> getByIdHabitos(Long id_habitos) {
		return repository.findById(id_habitos);
	}
	
	public String saveHabitosTreino (HabitosTreino habitosTreino) {
		repository.save(habitosTreino);
		return "Habitos de treino foi salvo com sucesso!";
	}
	
	public String editHabitosTreino (Long id_habitos, HabitosTreino habitosTreino) {
		HabitosTreino response = repository.findById(id_habitos).get();
		
		response.setHoras_trabalho_por_dia(habitosTreino.getHoras_trabalho_por_dia());
		response.setAtividade_trabalho(habitosTreino.getAtividade_trabalho());
		response.setDias_musculacao(habitosTreino.getDias_musculacao());
		response.setDias_aerobico(habitosTreino.getDias_aerobico());
		response.setTempo_musculacao(habitosTreino.getTempo_musculacao());
		response.setTempo_aerobico(habitosTreino.getTempo_aerobico());
		response.setExercicio_favorito(habitosTreino.getExercicio_favorito());
		response.setExercicio_nao_gosta(habitosTreino.getExercicio_nao_gosta());
		response.setGrupo_muscular_favorito(habitosTreino.getGrupo_muscular_favorito());
		response.setGosta_alongamento(habitosTreino.getGosta_alongamento());
		
		repository.save(response);
		return "Habitos de treino editado com sucesso!";
	}
	
	public void deletehabitosTreino (Long id_habitos) {
		HabitosTreino response = repository.findById(id_habitos).get();
		repository.delete(response);
	}
	

}
