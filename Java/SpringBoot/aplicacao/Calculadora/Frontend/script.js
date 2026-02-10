const campoN1 = document.getElementById("n1");
const campoN2 = document.getElementById("n2");
const seletor = document.getElementById("operacoes_matematicas");
const visorResultado = document.getElementById("resultado_operacao");

seletor.addEventListener("change", () => {

    const n1 = campoN1.value;
    const n2 = campoN2.value;
    const operacao = seletor.value;
    if (n1 === "" || n2 === "") {
        alert("Por favor, preencha os números!");
        return;
    }

    const URL = `http://localhost:8080/calculadora/${operacao}?n1=${n1}&n2=${n2}`;

    visorResultado.textContent = "Calculando...";

    fetch(URL)
        .then(resposta => {
            if (!resposta.ok) throw new Error("Erro na requisição");
            return resposta.text();
        })
        .then(resultado => {
            visorResultado.textContent = "Resultado: " + resultado;
        })
        .catch(erro => {
            visorResultado.textContent = "Erro: Servidor offline";
            console.error(erro);
        });
});