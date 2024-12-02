const url = "http://localhost:8080/questionario/todos-questionarios";

// Função para formatar a data no formato dd/mm/aaaa
function formatarData(dataString) {
    const data = new Date(dataString); // Cria um objeto Date com a string recebida
    const dia = String(data.getDate()).padStart(2, '0'); // Pega o dia e adiciona zero à esquerda se necessário
    const mes = String(data.getMonth() + 1).padStart(2, '0'); // Pega o mês (lembrando que o mês começa do 0)
    const ano = data.getFullYear(); // Pega o ano

    return `${dia}/${mes}/${ano}`; // Retorna a data no formato dd/mm/aaaa
}

async function buscarTodos() {
    const tbody = document.getElementById("listaQuestionarios");

    try {   
        const response = await fetch(url);
        const data = await response.json();

        let contador = 1;

        data.map((questionario) => {
            const tr = document.createElement("tr");

            const questHeader = document.createElement("td");
            questHeader.colSpan = 7; // Colspan para cobrir as 7 colunas
            questHeader.classList.add("quest-header");
            questHeader.innerHTML = `<strong>Quest ${contador.toString().padStart(2, '0')}</strong>`; // Adiciona o número da questão com dois dígitos
            tbody.appendChild(questHeader);
            contador++;

            // Nome Completo
            const nome = document.createElement("td");
            nome.classList.add("question-answer-pair");
            nome.innerHTML = `
                <div class="question">Nome Completo:</div>
                <div class="answer">${questionario.nome_completo || ""}</div>
            `;
            tr.appendChild(nome);

            // Data de Nascimento
            const dataNascimento = document.createElement("td");
            dataNascimento.classList.add("question-answer-pair");
            dataNascimento.innerHTML = `
                <div class="question">Data de Nascimento:</div>
                <div class="answer">${formatarData(questionario.data_nascimento) || ""}</div>
            `;
            tr.appendChild(dataNascimento);

            // Contato de Confiança
            const contato = document.createElement("td");
            contato.classList.add("question-answer-pair");
            contato.innerHTML = `
                <div class="question">Contato de Confiança:</div>
                <div class="answer">${questionario.contato_nome || ""}</div>
            `;
            tr.appendChild(contato);

            // Telefone de Contato
            const telefone = document.createElement("td");
            telefone.classList.add("question-answer-pair");
            telefone.innerHTML = `
                <div class="question">Telefone de Contato:</div>
                <div class="answer">${questionario.contato_telefone || ""}</div>
            `;
            tr.appendChild(telefone);

            // Horas de Trabalho
            const horasTrabalho = document.createElement("td");
            horasTrabalho.classList.add("question-answer-pair");
            horasTrabalho.innerHTML = `
                <div class="question">Horas de Trabalho:</div>
                <div class="answer">${questionario.horas_trabalho_por_dia || ""}</div>
            `;
            tr.appendChild(horasTrabalho);

            // Dias para treinar musculação
            const diasMusculacao = document.createElement("td");
            diasMusculacao.classList.add("question-answer-pair");
            diasMusculacao.innerHTML = `
                <div class="question">Dias para treinar musculação:</div>
                <div class="answer">${questionario.dias_musculacao || ""}</div>
            `;
            tr.appendChild(diasMusculacao);

            // Dias para treinar aeróbico
            const diasAerobico = document.createElement("td");
            diasAerobico.classList.add("question-answer-pair");
            diasAerobico.innerHTML = `
                <div class="question">Dias para treinar aeróbico:</div>
                <div class="answer">${questionario.dias_aerobico || ""}</div>
            `;
            tr.appendChild(diasAerobico);

            // Tempo para treinar musculação
            const tempoMusculacao = document.createElement("td");
            tempoMusculacao.classList.add("question-answer-pair");
            tempoMusculacao.innerHTML = `
                <div class="question">Tempo para treinar musculação:</div>
                <div class="answer">${questionario.tempo_musculacao || ""}</div>
            `;
            tr.appendChild(tempoMusculacao);

            // Tempo para treinar aeróbico
            const tempoAerobico = document.createElement("td");
            tempoAerobico.classList.add("question-answer-pair");
            tempoAerobico.innerHTML = `
                <div class="question">Tempo para treinar aeróbico:</div>
                <div class="answer">${questionario.tempo_aerobico || ""}</div>
            `;
            tr.appendChild(tempoAerobico);

            // Tem Lesão?
            const temLesao = document.createElement("td");
            temLesao.classList.add("question-answer-pair");
            temLesao.innerHTML = `
                <div class="question">Tem Lesão?</div>
                <div class="answer">${questionario.tem_lesao || ""}</div>
            `;
            tr.appendChild(temLesao);

            // Fator Limitante
            const fatorLimitante = document.createElement("td");
            fatorLimitante.classList.add("question-answer-pair");
            fatorLimitante.innerHTML = `
                <div class="question">Fator Limitante:</div>
                <div class="answer">${questionario.fator_limitante || ""}</div>
            `;
            tr.appendChild(fatorLimitante);

            // Cirurgia?
            const cirurgia = document.createElement("td");
            cirurgia.classList.add("question-answer-pair");
            cirurgia.innerHTML = `
                <div class="question">Cirurgia?</div>
                <div class="answer">${questionario.cirurgia || ""}</div>
            `;
            tr.appendChild(cirurgia);

            // Desconforto diário
            const desconfortoDiario = document.createElement("td");
            desconfortoDiario.classList.add("question-answer-pair");
            desconfortoDiario.innerHTML = `
                <div class="question">Desconforto diário:</div>
                <div class="answer">${questionario.desconforto_diario || ""}</div>
            `;
            tr.appendChild(desconfortoDiario);

            // Exercício favorito
            const exerciciosFavoritos = document.createElement("td");
            exerciciosFavoritos.classList.add("question-answer-pair");
            exerciciosFavoritos.innerHTML = `
                <div class="question">Exercício favorito:</div>
                <div class="answer">${questionario.exercicio_favorito || ""}</div>
            `;
            tr.appendChild(exerciciosFavoritos);

            const grupoMuscularFavorito = document.createElement("td");
            grupoMuscularFavorito.classList.add("question-answer-pair");
            grupoMuscularFavorito.innerHTML = ` 
                <div class="question">Grupo muscular favorito:</div>
                <div class="answer">${questionario.grupo_muscular_favorito || ""}</div>
            `;

            // Gosta de alongamento
            const gostaAlongamento = document.createElement("td");
            gostaAlongamento.classList.add("question-answer-pair");
            gostaAlongamento.innerHTML = `
                <div class="question">Gosta de alongamento:</div>
                <div class="answer">${questionario.gosta_alongamento || ""}</div>
            `;
            tr.appendChild(gostaAlongamento);

            // Faz dieta?
            const dieta = document.createElement("td");
            dieta.classList.add("question-answer-pair");
            dieta.innerHTML = `
                <div class="question">Faz dieta?</div>
                <div class="answer">${questionario.dieta || ""}</div>
            `;
            tr.appendChild(dieta);

            // Tem orientação nutricional
            const orientNutri = document.createElement("td");
            orientNutri.classList.add("question-answer-pair");
            orientNutri.innerHTML = `
                <div class="question">Tem orientação nutricional:</div>
                <div class="answer">${questionario.orientacao_nutricional || ""}</div>
            `;
            tr.appendChild(orientNutri);

            // Usa ergogênico?
            const usoErgogenico = document.createElement("td");
            usoErgogenico.classList.add("question-answer-pair");
            usoErgogenico.innerHTML = `
                <div class="question">Usa ergogênico?</div>
                <div class="answer">${questionario.uso_ergogenico || ""}</div>
            `;
            tr.appendChild(usoErgogenico);

            // Horas de Sono
            const horasSono = document.createElement("td");
            horasSono.classList.add("question-answer-pair");
            horasSono.innerHTML = `
                <div class="question">Horas de Sono:</div>
                <div class="answer">${questionario.horas_sono || ""}</div>
            `;
            tr.appendChild(horasSono);

            // Adicionando a linha (tr) na tabela
            tbody.appendChild(tr);

            const hr = document.createElement("hr");
            hr.classList.add("divider");
            tbody.appendChild(hr);
        });
    } catch (error) {
        console.error("Erro ao buscar questionários:", error);
        const errorMessage = document.getElementById("error-message");
        errorMessage.style.display = "block";
    }
}

// Chama a função para buscar e exibir os dados
buscarTodos();
