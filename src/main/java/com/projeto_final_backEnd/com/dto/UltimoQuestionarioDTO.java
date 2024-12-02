package com.projeto_final_backEnd.com.dto;

import java.time.LocalDate;

public class UltimoQuestionarioDTO {
    private String nome_completo;
    private String exercicio_favorito;
    private String grupo_muscular_favorito;
    private LocalDate horas_sono;
    
	public UltimoQuestionarioDTO() {}

	public UltimoQuestionarioDTO(String nome_completo, String exercicio_favorito, String grupo_muscular_favorito,
			LocalDate horas_sono) {
		super();
		this.nome_completo = nome_completo;
		this.exercicio_favorito = exercicio_favorito;
		this.grupo_muscular_favorito = grupo_muscular_favorito;
		this.horas_sono = horas_sono;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getExercicio_favorito() {
		return exercicio_favorito;
	}

	public void setExercicio_favorito(String exercicio_favorito) {
		this.exercicio_favorito = exercicio_favorito;
	}

	public String getGrupo_muscular_favorito() {
		return grupo_muscular_favorito;
	}

	public void setGrupo_muscular_favorito(String grupo_muscular_favorito) {
		this.grupo_muscular_favorito = grupo_muscular_favorito;
	}

	public LocalDate getHoras_sono() {
		return horas_sono;
	}

	public void setHoras_sono(LocalDate horas_sono) {
		this.horas_sono = horas_sono;
	}

    
	
}
