// Bibliotecas que serão utilizadas
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Classe responável por armazenar as funções auxiliares
    public class calculadora_funcoes_auxiliares {
    // ArrayList do tipo Double que armazena os valores inseridos pelo usuário
    private final ArrayList<Double> numeros = new ArrayList<>();

    // Função que adiciona os valores inseridos pelo usuário na ArrayList
    public void adicionar_valores(double valor_inserido){
        this.numeros.add(valor_inserido);
    }

    // Função sem retorno que mostra o conteúdo presente na lista alterada pelas operações matemáticas
    public void visualizar_lista(List<Double> lista_alterada){
        // Verificação se a lista está vazia
        if (lista_alterada.isEmpty()){
            System.out.println("Lista vazia!");
            return;
        }
        System.out.println("Lista alterada");
        // Laço de repetição para mostrar o conteúdo completo da lista
        for(double numero : lista_alterada){
            System.out.printf("%.2f ",numero);
        }
    }

    // Função responsável por verificar se a ArrayList está vazia
    private boolean lista_vazia(ArrayList<Double> lista_numeros){
        return lista_numeros.isEmpty();
    }

    // Função que soma todos os elementos do ArrayList pelo valor inserido pelo usuário
    public List<Double> somatorio_valores(double valor){
        if (lista_vazia(this.numeros)){
            return Collections.emptyList();
        }
        // Map que percorre a ArrayList e soma cada elemento pelo valor inserido e retorna uma lista
        return this.numeros.stream().map(numero -> numero + valor).toList();
    }

    // Função que subtrai todos os elementos do ArrayList pelo valor inserido pelo usuário
    public List<Double> subtracao_valores(double valor){
        if (lista_vazia(this.numeros)){
            return Collections.emptyList();
        }
        // Map que percorre a ArrayList e subtrai cada elemento pelo valor inserido e retorna uma lista
        return this.numeros.stream().map(numero -> numero - valor).toList();
    }

    // Função que divide todos os elementos do ArrayList pelo valor inserido pelo usuário
    public List<Double> divisao_valores(double valor){
        if (valor == 0){
            System.err.println("Erro: não é possível dividir por zero!");
            return Collections.emptyList();
        }
        if (lista_vazia(this.numeros)){
            return Collections.emptyList();
        }
        // Map que percorre a ArrayList e divide cada elemento pelo valor inserido e retorna uma lista
        return this.numeros.stream().map(numero -> numero / valor).toList();
    }

    // Função que multiplica todos os elementos do ArrayList pelo valor inserido pelo usuário
    public List<Double> multiplicacao_valores(double valor){
        if (lista_vazia(this.numeros)){
            return Collections.emptyList();
        }
        // Map que percorre a ArrayList e multiplica cada elemento pelo valor inserido e retorna uma lista
        return this.numeros.stream().map(numero -> numero * valor).toList();
    }
}
