import java.util.ArrayList;

// Classe responsável por armazenar informações de conta
public class Conta {
    // ArrayList de usuários
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    // Saldo bancário, método privado para impedir alteração direta.
    private double saldo_bancario;

    public Conta(){}

    // Função para adicionar usuário, recebe como parâmetro uma instância da classe Usuario
    public void adicionar_usuario(Usuario usuario){
        this.usuarios.add(usuario); // Adição do usuário na ArrayList
    }

    // Função responsável por modificar a variável saldo_bancario, adicionando novos valores
    public void adicionar_saldo(double valor){
        // Verificação simples de valor depositado
        if (valor <= 0){
            System.out.println("O valor de depósito deve ser positivo!");
            return;
        }
        // Nova atribuição da variável saldo_bancario
        this.saldo_bancario += valor;
        System.out.println("Saldo adicionado com sucesso!");
    }

    // Função responsável por modificar a variável saldo_bancario, removendo valores
    public void retirar_saldo(double valor){
        // Verificação simples
        if (valor > saldo_bancario) {
            System.out.println("Saldo insuficiente para realizar o saque!");
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido!");
        } else {
            this.saldo_bancario -= valor;
            System.out.println("Saque efetuado com sucesso!");
        }
    }

    public void extrato(){
        System.out.printf("Saldo atual: R$ %.2f%n", saldo_bancario);
        for(Usuario usuario : usuarios){
            System.out.println("Titular: " + usuario.getNome());
        }
    }

    // Função principal, responsável por executar o código
    public static void main(String[] args){
        Conta conta1 = new Conta(); // Instância de novo objeto conta
        // Adição de usuário
        conta1.adicionar_usuario(new Usuario(
                "Júlio",
                19,
                1.86,
                "rua_jatoba"
        ));
        // Testando funções de adição, retirada e visualização do extrato bancário
        conta1.adicionar_saldo(1200);
        conta1.extrato();
        conta1.retirar_saldo(600);
        conta1.extrato();
    }
}
