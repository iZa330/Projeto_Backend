
    const url = "http://localhost:8080/questionario";

    const nomeCompleto = document.getElementById("nomeCompleto");
    const dataNascimento = document.getElementById("dataNascimento");
    const contatoNome = document.getElementById("contatoNome");
    const contatoTelefone = document.getElementById("contatoTelefone");
    const horasTrabalho = document.getElementById("horasTrabalho");
    const diasMusculacao = document.getElementById("diasMusculacao");
    const diasAerobico = document.getElementById("diasAerobico");
    const tempoMusculacao = document.getElementById("tempoMusculacao");
    const tempoAerobico = document.getElementById("tempoAerobico");
    const atividadeTrabalho = document.getElementById("atividadeTrabalho");
    const temLesao = document.getElementById("temLesao");
    const fatorLimitante = document.getElementById("fatorLimitante");
    const fezCirurgia = document.getElementById("fezCirurgia");
    const desconfortoDiario = document.getElementById("desconfortoDiario");
    const desconfortoExercicio = document.getElementById("desconfortoExercicio");
    const grupoMuscularFavorito = document.getElementById("grupoMuscularFavorito");
    const exerciciosFavoritos = document.getElementById("exerciciosFavoritos");
    const exercicioNaoGosta = document.getElementById("exercicioNaoGosta");
    const gostaAlongamento = document.getElementById("gostaAlongamento");
    const fazDieta = document.getElementById("fazDieta");
    const orientacaoNutricional = document.getElementById("orientacaoNutricional");
    const usoErgogenicos = document.getElementById("usoErgogenicos");
    const horasSono = document.getElementById("horasSono");

    const btnCriar = document.getElementById("btnCriar");

    btnCriar.addEventListener("click", (e) => {
        e.preventDefault();

        const data = {
            nome_completo: nomeCompleto.value,
            data_nascimento: dataNascimento.value,
            contato_nome: contatoNome.value,
            contato_telefone: contatoTelefone.value,
            horas_trabalho_por_dia: horasTrabalho.value,
            dias_musculacao: diasMusculacao.value,
            dias_aerobico: diasAerobico.value,
            tempo_musculacao: tempoMusculacao.value,
            tempo_aerobico: tempoAerobico.value,
            atividade_trabalho: atividadeTrabalho.value,
            tem_lesao: temLesao.value,
            fator_limitante: fatorLimitante.value,
            cirurgia: fezCirurgia.value,
            desconforto_diario: desconfortoDiario.value,
            desconforto_exercicio: desconfortoExercicio.value,
            exercicio_favorito: exerciciosFavoritos.value,
            grupo_muscular_favorito: grupoMuscularFavorito.value,
            exercicio_nao_gosta: exercicioNaoGosta.value,
            gosta_alongamento: gostaAlongamento.value,
            dieta: fazDieta.value,
            orientacao_nutricional: orientacaoNutricional.value,
            uso_ergogenico: usoErgogenicos.value,
            horas_sono: horasSono.value,
        };

        console.log("Dados enviados:", data);

        fetch(url ,{
            method: "POST",
            headers:{
                "Content-Type": "application/json"
            },
            body: JSON.stringify(data),
        })
        .then(res => res.text())
        .then(res => alert(res))
        .catch(error => console.error("Erro na requisição:", error));
    });

