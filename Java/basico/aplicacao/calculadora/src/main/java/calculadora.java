// Importando a biblioteca Scanner para permitir leitura do teclado
import java.util.Scanner;
// Classe responsável por gerenciar as funções da calculadora
public class calculadora {
    // Criação do objeto de leitura
    private final Scanner leitura_teclado = new Scanner(System.in);
    // Variável de controle do funcionamento do menu
    private boolean funcionamento_menu = true;
    // Criação do objeto da classe das funções auxiliares
    private final calculadora_funcoes_auxiliares funcoesAuxiliares = new calculadora_funcoes_auxiliares();

    // Método construtor da classe
    public calculadora(){}

    // Função sem retorno que armazena o menu da aplicação
    public void menu(){
        // Laço de repetição - visualização e funcionamento da aplicação
        do {
            // Menu no formado String
            String output = """
                    \n
                    Selecione uma das opções:
                    (1) - Adicionar valores
                    (2) - Somatório dos valores
                    (3) - Subtração dos valores
                    (4) - Divisão dos valores
                    (5) - Multiplicação dos valores
                    (6) - Sair
                    """;
            System.out.println(output);
            System.out.print("Digite a opção: ");
            // Switch-case para navegar entre as opções
            switch (leitura_teclado.nextInt()){
                case 1:
                    // Laço de repetição para armazenar os valores enquando o valor inserido for diferente de -1
                    while (true) {
                        System.out.println("Digite -1 para parar a inserção de valores");
                        System.out.print("Digite o valor: ");
                        double valor_inserido = leitura_teclado.nextDouble();
                        if (valor_inserido == -1) {
                            break;
                        }
                        // Chamada da função auxiliar que adiciona valores na ArrayList do tipo Double
                        funcoesAuxiliares.adicionar_valores(valor_inserido);
                    }
                    break;
                    // Nos casos 2, 3, 4, 5 são chamadas as funções de visualizar lista e operações matemáticas
                case 2:
                    System.out.print("Digite o valor que vai ser somado na lista: ");
                    double valor_soma = leitura_teclado.nextDouble();
                    funcoesAuxiliares.visualizar_lista(funcoesAuxiliares.somatorio_valores(valor_soma));
                    break;
                case 3:
                    System.out.print("Digite o valor que vai ser subtraido na lista: ");
                    double valor_subtracao = leitura_teclado.nextDouble();
                    funcoesAuxiliares.visualizar_lista(funcoesAuxiliares.subtracao_valores(valor_subtracao));
                    break;
                case 4:
                    System.out.print("Digite o valor que vai ser dividido na lista: ");
                    double valor_dividido = leitura_teclado.nextDouble();
                    funcoesAuxiliares.visualizar_lista(funcoesAuxiliares.divisao_valores(valor_dividido));
                    break;
                case 5:
                    System.out.print("Digite o valor que vai ser multiplicado na lista: ");
                    double valor_multiplicado = leitura_teclado.nextDouble();
                    funcoesAuxiliares.visualizar_lista(funcoesAuxiliares.multiplicacao_valores(valor_multiplicado));
                    break;
                case 6:
                    // Case para interromper o funcionamento do menu
                    funcionamento_menu = false;
                    break;
                default:
                    // Verificação de opção incorreta digitada
                    System.out.println("Opção incorreta, digite novamente!");
                    break;
            }
        }while(funcionamento_menu);
    }
    static void main(String[] args){
        // Criação do objeto da classe calculadora e chamada da função (menu)
        new calculadora().menu();
    }
}
