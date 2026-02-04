import java.util.Scanner;

public class estudo {
    Scanner leitura_teclado = new Scanner(System.in);
    boolean funcionamento_menu = true;
    String nome = "Júlio";
    int idade = 19;
    double altura = 1.87;
    String sexo = "masculino";

    public void menu(){
        String resposta = """
                (1) - mostrar meu nome
                (2) - mostrar minha idade
                (3) - mostrar minha altura
                (4) - mostar meu sexo
                (5) - Sair
                """;
        while (funcionamento_menu) {
            System.out.println(resposta);
            System.out.println("Selecione uma das opções:");
            switch (leitura_teclado.nextInt()){
                case 1:
                    System.out.println("Nome: " + nome);
                    break;
                case 2:
                    System.out.println("Idade: " + idade);
                    break;
                case 3:
                    System.out.println("Altura: " + altura);
                    break;
                case 4:
                    System.out.println("Sexo: " + sexo);
                    break;
                case 5:
                    funcionamento_menu = false;
                    break;
                default:
                    System.out.println("Opção incorreta!");
                    break;
            }
        }
    }
}
