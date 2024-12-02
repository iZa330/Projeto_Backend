package com.projeto_final_backEnd.com.dto;

import java.time.LocalDate;


public class QuestionarioDTO {

		// Dados do Cliente
	    private String nome_completo;
	    private LocalDate data_nascimento;
	    private String contato_nome;
	    private String contato_telefone;

	    // Dados de Hábito de Treino
	    private Integer horas_trabalho_por_dia;
	    private String atividade_trabalho;
	    private Integer dias_musculacao;
	    private Integer dias_aerobico;
	    private Integer tempo_musculacao;
	    private Integer tempo_aerobico;
	    private String exercicio_favorito;
	    private String exercicio_nao_gosta;
	    private String grupo_muscular_favorito;
	    private String gosta_alongamento;

	    // Dados de Anamnese
	    private String tem_lesao;
	    private String fator_limitante;
	    private String cirurgia;
	    private String desconforto_diario;
	    private String desconforto_exercicio;
	    private String dieta;
	    private String orientacao_nutricional;
	    private String detalhe_nutri;
	    private String uso_ergogenico;
	    private Integer horas_sono;
	    
	    public QuestionarioDTO() {}
	    
	    public QuestionarioDTO(String string, LocalDate localDate, String string2, String string3, Integer integer, String string4, Integer integer2, Integer integer3, Integer integer4, Integer integer5, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, Integer integer6) {}
	    
	   
		public QuestionarioDTO(String nome_completo, LocalDate data_nascimento, String contato_nome,
				String contato_telefone, Integer horas_trabalho_por_dia, String atividade_trabalho,
				Integer dias_musculacao, Integer dias_aerobico, Integer tempo_musculacao, Integer tempo_aerobico,
				String exercicio_favorito, String exercicio_nao_gosta, String grupo_muscular_favorito,
				String gosta_alongamento, String tem_lesao, String fator_limitante, String cirurgia,
				String desconforto_diario, String desconforto_exercicio, String dieta, String orientacao_nutricional,
				String detalhe_nutri, String uso_ergogenico, Integer horas_sono) {
			super();
			this.nome_completo = nome_completo;
			this.data_nascimento = data_nascimento;
			this.contato_nome = contato_nome;
			this.contato_telefone = contato_telefone;
			this.horas_trabalho_por_dia = horas_trabalho_por_dia;
			this.atividade_trabalho = atividade_trabalho;
			this.dias_musculacao = dias_musculacao;
			this.dias_aerobico = dias_aerobico;
			this.tempo_musculacao = tempo_musculacao;
			this.tempo_aerobico = tempo_aerobico;
			this.exercicio_favorito = exercicio_favorito;
			this.exercicio_nao_gosta = exercicio_nao_gosta;
			this.grupo_muscular_favorito = grupo_muscular_favorito;
			this.gosta_alongamento = gosta_alongamento;
			this.tem_lesao = tem_lesao;
			this.fator_limitante = fator_limitante;
			this.cirurgia = cirurgia;
			this.desconforto_diario = desconforto_diario;
			this.desconforto_exercicio = desconforto_exercicio;
			this.dieta = dieta;
			this.orientacao_nutricional = orientacao_nutricional;
			this.detalhe_nutri = detalhe_nutri;
			this.uso_ergogenico = uso_ergogenico;
			this.horas_sono = horas_sono;
		}





		public String getNome_completo() {
			return nome_completo;
		}
		public void setNome_completo(String nome_completo) {
			this.nome_completo = nome_completo;
		}
		public LocalDate getData_nascimento() {
			return data_nascimento;
		}
		public void setData_nascimento(LocalDate data_nascimento) {
			this.data_nascimento = data_nascimento;
		}
		public String getContato_nome() {
			return contato_nome;
		}
		public void setContato_nome(String contato_nome) {
			this.contato_nome = contato_nome;
		}
		public String getContato_telefone() {
			return contato_telefone;
		}
		public void setContato_telefone(String contato_telefone) {
			this.contato_telefone = contato_telefone;
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
		public void setCirurgia(String cirurgia) {
			this.cirurgia = cirurgia;
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
		public String getDetalhe_nutri() {
			return detalhe_nutri;
		}
		public void setDetalhe_nutri(String detalhe_nutri) {
			this.detalhe_nutri = detalhe_nutri;
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
}
