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
public class Anamnese {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_anamnese;
	
	@Column(nullable=false)
	private String tem_lesao;
	
	
	@Column(nullable=false)
	private String fator_limitante;
	
	@Column(nullable=false)
	private String cirurgia;
	
	
	@Column(nullable=false)
	private String desconforto_diario;
	
	@Column(nullable=false)
	private String desconforto_exercicio;
	
	
	@Column(nullable=false)
	private String dieta;
	
	
	
	@Column(nullable=false)
	private String orientacao_nutricional;

	
	//@Column(nullable=false)
	private String uso_ergogenico;
	
	
	
	@Column(nullable=false)
	private Integer horas_sono;
	
	@JsonBackReference
	@OneToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

	
	public Anamnese() {}
	

	public Anamnese(Long id_anamnese, String tem_lesao, String fator_limitante, String cirurgia,
			String desconforto_diario, String desconforto_exercicio, String dieta, String orientacao_nutricional,
			String uso_ergogenico, Integer horas_sono) {
		super();
		this.id_anamnese = id_anamnese;
		this.tem_lesao = tem_lesao;
		this.fator_limitante = fator_limitante;
		this.cirurgia = cirurgia;
		this.desconforto_diario = desconforto_diario;
		this.desconforto_exercicio = desconforto_exercicio;
		this.dieta = dieta;
		this.orientacao_nutricional = orientacao_nutricional;
		this.uso_ergogenico = uso_ergogenico;
		this.horas_sono = horas_sono;
	}


	public Long getId_anamnese() {
		return id_anamnese;
	}

	public void setId_anamnese(Long id_anamnese) {
		this.id_anamnese = id_anamnese;
	}

	public String getTem_lesao() {
		return tem_lesao;
	}

	public void setTem_lesao(String tem_lesao) {
		this.tem_lesao = tem_lesao;
	}

	public String getFator_limitante() {
		return fator_limitante;
	}

	public void setFator_limitante(String fator_limitante) {
		this.fator_limitante = fator_limitante;
	}

	public String getCirurgia() {
		return cirurgia;
	}

	public void setCirurgia(String cirugia) {
		this.cirurgia = cirugia;
	}

	public String getDesconforto_diario() {
		return desconforto_diario;
	}

	public void setDesconforto_diario(String desconforto_diario) {
		this.desconforto_diario = desconforto_diario;
	}

	public String getDesconforto_exercicio() {
		return desconforto_exercicio;
	}

	public void setDesconforto_exercicio(String desconforto_exercicio) {
		this.desconforto_exercicio = desconforto_exercicio;
	}


	public String getDieta() {
		return dieta;
	}

	public void setDieta(String dieta) {
		this.dieta = dieta;
	}

	public String getOrientacao_nutricional() {
		return orientacao_nutricional;
	}

	public void setOrientacao_nutricional(String orientacao_nutricional) {
		this.orientacao_nutricional = orientacao_nutricional;
	}

	public String getUso_ergogenico() {
		return uso_ergogenico;
	}

	public void setUso_ergogenico(String uso_ergogenico) {
		this.uso_ergogenico = uso_ergogenico;
	}

	public Integer getHoras_sono() {
		return horas_sono;
	}


	public void setHoras_sono(Integer horas_sono) {
		this.horas_sono = horas_sono;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

	/*public Set<Cliente> getCliente_anamnese() {
		return cliente_anamnese;
	}

	public void setCliente_anamnese(Set<Cliente> cliente_anamnese) {
		this.cliente_anamnese = cliente_anamnese;
	}*/

}
