package com.projeto_final_backEnd.com.mappers;

import com.projeto_final_backEnd.com.dto.QuestionarioDTO;
import com.projeto_final_backEnd.com.entities.Anamnese;
import com.projeto_final_backEnd.com.entities.Cliente;
import com.projeto_final_backEnd.com.entities.HabitosTreino;

public class QuestionarioMapper {

	public static QuestionarioDTO toDTO(Anamnese anamnese, Cliente cliente, HabitosTreino habitos) {
        QuestionarioDTO dto = new QuestionarioDTO();
        
        // Mapeando os dados de Cliente
        dto.setNome_completo(cliente.getNome_completo());
        dto.setData_nascimento(cliente.getData_nascimento());
        dto.setContato_nome(cliente.getContato_nome());
        dto.setContato_telefone(cliente.getContato_telefone());
        
        // Mapeando os dados de HabitosTreino
        dto.setHoras_trabalho_por_dia(habitos.getHoras_trabalho_por_dia());
        dto.setAtividade_trabalho(habitos.getAtividade_trabalho());
        dto.setDias_musculacao(habitos.getDias_musculacao());
        dto.setDias_aerobico(habitos.getDias_aerobico());
        dto.setTempo_musculacao(habitos.getTempo_musculacao());
        dto.setTempo_aerobico(habitos.getTempo_aerobico());
        dto.setExercicio_favorito(habitos.getExercicio_favorito());
        dto.setExercicio_nao_gosta(habitos.getExercicio_nao_gosta());
        dto.setGrupo_muscular_favorito(habitos.getGrupo_muscular_favorito());
        dto.setGosta_alongamento(habitos.getGosta_alongamento());

        // Mapeando os dados de Anamnese
        dto.setTem_lesao(anamnese.getTem_lesao());
        dto.setFator_limitante(anamnese.getFator_limitante());
        dto.setCirurgia(anamnese.getCirurgia());
        dto.setDesconforto_diario(anamnese.getDesconforto_diario());
        dto.setDesconforto_exercicio(anamnese.getDesconforto_exercicio());
        dto.setDieta(anamnese.getDieta());
        dto.setOrientacao_nutricional(anamnese.getOrientacao_nutricional());
        dto.setUso_ergogenico(anamnese.getUso_ergogenico());
        dto.setHoras_sono(anamnese.getHoras_sono());

        return dto;
    }
}
