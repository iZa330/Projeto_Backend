document.addEventListener("DOMContentLoaded", async function() {
    // URL da API que retorna o último questionário preenchido
    const url = "http://localhost:8080/questionario/ultimo";  // Substitua pelo URL correto

    try {
        // Fazendo a requisição para pegar o último questionário
        const response = await fetch(url);
        if (!response.ok) {
            throw new Error("Erro ao carregar o último questionário");
        }

        const ultimoQuestionario = await response.json();

        // Obtém o elemento onde os dados serão exibidos
        const divUltimoQuestionario = document.getElementById("ultimoQuestionario");

        // Preenche a div com os dados do último questionário (apenas os campos solicitados)
        divUltimoQuestionario.innerHTML = `
            <div class="question-answer-pair">
                <div class="question">Nome Completo:</div>
                <div class="answer">${ultimoQuestionario.nome_completo || ""}</div>
            </div>
            <div class="question-answer-pair">
                <div class="question">Exercício Favorito:</div>
                <div class="answer">${ultimoQuestionario.exercicio_favorito || ""}</div>
            </div>
            <div class="question-answer-pair">
                <div class="question">Grupo Muscular Favorito:</div>
                <div class="answer">${ultimoQuestionario.grupo_muscular_favorito || ""}</div>
            </div>
            <div class="question-answer-pair">
                <div class="question">Horas de Sono:</div>
                <div class="answer">${ultimoQuestionario.horas_sono || ""}</div>
            </div>
        `;
    } catch (error) {
        console.error("Erro ao buscar o último questionário:", error);
        document.getElementById("ultimoQuestionario").innerHTML = "<p>Erro ao carregar o último questionário.</p>";
    }
});

