package com.projeto_final_backEnd.com.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.projeto_final_backEnd.com.dto.QuestionarioDTO;
import com.projeto_final_backEnd.com.dto.UltimoQuestionarioDTO;
import com.projeto_final_backEnd.com.entities.Anamnese;
import com.projeto_final_backEnd.com.entities.Cliente;
import com.projeto_final_backEnd.com.entities.HabitosTreino;
import com.projeto_final_backEnd.com.mappers.QuestionarioMapper;
import com.projeto_final_backEnd.com.repositories.AnamneseRepository;
import com.projeto_final_backEnd.com.repositories.ClienteRepository;
import com.projeto_final_backEnd.com.repositories.HabitosTreinoRepository;


@Service
public class QuestionarioService {

	private final ClienteRepository clienteRepository;
	private final AnamneseRepository anamneseRepository;
	private final HabitosTreinoRepository habitosRepository;
	
	
	public QuestionarioService(
			ClienteRepository clienteRepository,
			AnamneseRepository anamneseRepository,
			HabitosTreinoRepository habitosRepository) {
		this.clienteRepository = clienteRepository;
		this.anamneseRepository = anamneseRepository;
		this.habitosRepository = habitosRepository;
	}
	
	public void saveQuestionario(QuestionarioDTO dto) {
		Cliente cliente = new Cliente();
		cliente.setNome_completo(dto.getNome_completo());
		cliente.setData_nascimento(dto.getData_nascimento());
		cliente.setContato_nome(dto.getContato_nome());
		cliente.setContato_telefone(dto.getContato_telefone());
		clienteRepository.save(cliente);
		
		Anamnese anamnese = new Anamnese();
		anamnese.setTem_lesao(dto.getTem_lesao());
		anamnese.setFator_limitante(dto.getFator_limitante());
		anamnese.setCirurgia(dto.getCirurgia());
		anamnese.setDesconforto_diario(dto.getDesconforto_diario());
		anamnese.setDesconforto_exercicio(dto.getDesconforto_exercicio());
		anamnese.setDieta(dto.getDieta());
		anamnese.setOrientacao_nutricional(dto.getOrientacao_nutricional());
		anamnese.setUso_ergogenico(dto.getUso_ergogenico());
		anamnese.setHoras_sono(dto.getHoras_sono());
		
		

		anamneseRepository.save(anamnese);
		
		HabitosTreino habitos = new HabitosTreino();
		habitos.setHoras_trabalho_por_dia(dto.getHoras_trabalho_por_dia());
		habitos.setAtividade_trabalho(dto.getAtividade_trabalho());
		habitos.setDias_musculacao(dto.getDias_musculacao());
		habitos.setDias_aerobico(dto.getDias_aerobico());
		habitos.setTempo_musculacao(dto.getTempo_musculacao());
		habitos.setTempo_aerobico(dto.getTempo_aerobico());
		habitos.setExercicio_favorito(dto.getExercicio_favorito());
		habitos.setExercicio_nao_gosta(dto.getExercicio_nao_gosta());
		habitos.setGrupo_muscular_favorito(dto.getGrupo_muscular_favorito());;
		habitos.setGosta_alongamento(dto.getGosta_alongamento());
		habitosRepository.save(habitos);
	}
	
	

    
	public List<QuestionarioDTO> getTodosQuestionarios() {
	    List<Cliente> clientes = clienteRepository.findAll();

	    return clientes.stream().map(cliente -> {
	        
	        Anamnese anamnese = anamneseRepository.findById(cliente.getId_cliente()).orElse(null);
	        HabitosTreino habitos = habitosRepository.findById(cliente.getId_cliente()).orElse(null);

	        
	        if (anamnese == null || habitos == null) {
	            System.out.println("Dados faltando para o cliente ID: " + cliente.getId_cliente());
	            return null;
	        }

	        return QuestionarioMapper.toDTO(anamnese, cliente, habitos);
	    })
	    .filter(questionarioDTO -> questionarioDTO != null)  // Filtra resultados nulos
	    .collect(Collectors.toList());
	}

    
    public Optional<QuestionarioDTO> getByIdQuestionario(Long id_cliente) {
        Optional<Cliente> clienteOpt = clienteRepository.findById(id_cliente);
        
        if (clienteOpt.isPresent()) {
            Cliente cliente = clienteOpt.get();
            
            Anamnese anamnese = anamneseRepository.findById(cliente.getId_cliente())
                    .orElseThrow(() -> new RuntimeException("Anamnese não encontrada"));

            HabitosTreino habitos = habitosRepository.findById(cliente.getId_cliente())
                    .orElseThrow(() -> new RuntimeException("Hábitos de treino não encontrados"));

            QuestionarioDTO questionario = new QuestionarioDTO(
                    cliente.getNome_completo(),
                    cliente.getData_nascimento(),
                    cliente.getContato_nome(),
                    cliente.getContato_telefone(),
                    habitos.getHoras_trabalho_por_dia(),
                    habitos.getAtividade_trabalho(),
                    habitos.getDias_musculacao(),
                    habitos.getDias_aerobico(),
                    habitos.getTempo_musculacao(),
                    habitos.getTempo_aerobico(),
                    habitos.getExercicio_favorito(),
                    habitos.getExercicio_nao_gosta(),
                    habitos.getGrupo_muscular_favorito(),
                    habitos.getGosta_alongamento(),
                    anamnese.getTem_lesao(),
                    anamnese.getFator_limitante(),
                    anamnese.getCirurgia(),
                    anamnese.getDesconforto_diario(),
                    anamnese.getDesconforto_exercicio(),
                    anamnese.getDieta(),
                    anamnese.getOrientacao_nutricional(),
                    anamnese.getUso_ergogenico(),
                    anamnese.getHoras_sono()
            );

            return Optional.of(questionario);
        } else {
            return Optional.empty();
        }
    }
    
    public UltimoQuestionarioDTO getUltimoQuestionario() {
        
        Cliente ultimoCliente = clienteRepository.findTopByOrderById_clienteDesc()
                .orElseThrow(() -> new RuntimeException("Nenhum cliente encontrado."));
        
        HabitosTreino habitos = habitosRepository.findById(ultimoCliente.getId_cliente())
                .orElseThrow(() -> new RuntimeException("Hábitos de treino não encontrados."));
        
        Anamnese anamnese = anamneseRepository.findById(ultimoCliente.getId_cliente())
                .orElseThrow(() -> new RuntimeException("Anamnese não encontrada."));
        
        
        LocalDate dataSono = LocalDate.now();
        
        return new UltimoQuestionarioDTO(
                ultimoCliente.getNome_completo(),
                habitos.getExercicio_favorito(),
                habitos.getGrupo_muscular_favorito(),
                dataSono 
        );
    }
    
    
    
   
}
