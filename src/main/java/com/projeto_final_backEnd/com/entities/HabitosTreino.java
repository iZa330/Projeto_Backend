package com.projeto_final_backEnd.com.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class HabitosTreino {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_habitos;
	
	@Column(nullable = false)
	private Integer horas_trabalho_por_dia;
	
	@Column(nullable = false)
	private String atividade_trabalho;
	
	@Column(nullable = false)
	private Integer dias_musculacao;
	
	@Column(nullable = false)
	private Integer dias_aerobico;
	
	@Column(nullable = false)
	private Integer tempo_musculacao;
	
	@Column(nullable = false)
	private Integer tempo_aerobico;
	
	@Column(nullable = false)
	private String exercicio_favorito;
	
	@Column(nullable = false)
	private String exercicio_nao_gosta;
	
	//@Column(nullable = false)
	private String grupo_muscular_favorito;
	
	@Column(nullable = false)
	private String gosta_alongamento;
	
	@JsonBackReference
	@OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
	
	public HabitosTreino() {}

	public Long getId_habitos() {
		return id_habitos;
	}

	public void setId_habitos(Long id_habitos) {
		this.id_habitos = id_habitos;
	}

	public Integer getHoras_trabalho_por_dia() {
		return horas_trabalho_por_dia;
	}

	public void setHoras_trabalho_por_dia(Integer horas_trabalho_por_dia) {
		this.horas_trabalho_por_dia = horas_trabalho_por_dia;
	}

	public String getAtividade_trabalho() {
		return atividade_trabalho;
	}

	public void setAtividade_trabalho(String atividade_trabalho) {
		this.atividade_trabalho = atividade_trabalho;
	}

	public Integer getDias_musculacao() {
		return dias_musculacao;
	}

	public void setDias_musculacao(Integer dias_musculacao) {
		this.dias_musculacao = dias_musculacao;
	}

	public Integer getDias_aerobico() {
		return dias_aerobico;
	}

	public void setDias_aerobico(Integer dias_aerobico) {
		this.dias_aerobico = dias_aerobico;
	}

	public Integer getTempo_musculacao() {
		return tempo_musculacao;
	}

	public void setTempo_musculacao(Integer tempo_musculacao) {
		this.tempo_musculacao = tempo_musculacao;
	}

	public Integer getTempo_aerobico() {
		return tempo_aerobico;
	}

	public void setTempo_aerobico(Integer tempo_aerobico) {
		this.tempo_aerobico = tempo_aerobico;
	}

	public String getExercicio_favorito() {
		return exercicio_favorito;
	}

	public void setExercicio_favorito(String exercicio_favorito) {
		this.exercicio_favorito = exercicio_favorito;
	}

	public String getExercicio_nao_gosta() {
		return exercicio_nao_gosta;
	}

	public void setExercicio_nao_gosta(String exercicio_nao_gosta) {
		this.exercicio_nao_gosta = exercicio_nao_gosta;
	}

	public String getGrupo_muscular_favorito() {
		return grupo_muscular_favorito;
	}

	public void setGrupo_muscular_favorito(String grupo_muscular_favorito) {
		this.grupo_muscular_favorito = grupo_muscular_favorito;
	}

	public String getGosta_alongamento() {
		return gosta_alongamento;
	}

	public void setGosta_alongamento(String gosta_alongamento) {
		this.gosta_alongamento = gosta_alongamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

	/*public Set<Cliente> getCliente_habtreino() {
		return cliente_habtreino;
	}

	public void setCliente_habtreino(Set<Cliente> cliente_habtreino) {
		this.cliente_habtreino = cliente_habtreino;
	}*/

}
