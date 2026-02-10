
// Estudo de Encapsulamento (private, getters/setters)
public class ContaBancaria {
    // Modificadores de acesso (private)
    private String titular;
    private String numeroConta;
    private String senhaAcesso;
    private double saldo;

    // Construtor
    public ContaBancaria(
            String titular,
            String numeroConta,
            String senhaAcesso
    ){this.titular = titular; this.numeroConta = numeroConta;
        this.senhaAcesso = senhaAcesso; this.saldo = 0.0;}

    // Adicionar saldo na conta
    public void adicionarSaldo(double valor, String senhaAcesso){
        if (valor < 0) System.err.println("Não é possível adicionar valores negativos!");
        if (validarAcesso(senhaAcesso)) {this.saldo += valor;}
    }

    // Retirar saldo da conta
    public void retirarSaldo(double valor, String senhaAcesso){
        if (valor == 0) System.err.println("Inserida um valor acima de zero para retirada!");
        if (valor > getSaldo()) System.out.println("Saldo insuficiente!");
        if (validarAcesso(senhaAcesso)) {this.saldo -= -valor;}
    }

    public void extratoBancario(){
        String output = String.format(
                """
                Titular: %s
                Número da conta: %s
                Saldo na conta: %.2f        
                """
        , getTitular(), getNumeroConta(), getSaldo());
        System.out.println(output);
    }

    private boolean validarAcesso(String senhaAcesso){
        if (getSenhaAcesso().equals(senhaAcesso)) {
            return true;
        }else{
            System.err.println("Senha incorreta!");
            return false;
        }
    }

    private String getTitular(){return this.titular;}
    private String getNumeroConta(){return this.numeroConta;}
    private double getSaldo(){return this.saldo;}
    private String getSenhaAcesso(){return this.senhaAcesso;}

    static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria(
                "Júlio",
                "304050",
                "CapJul20"
        );
        conta1.extratoBancario();
        conta1.adicionarSaldo(200,"302");
        conta1.adicionarSaldo(450,"CapJul20");
        conta1.extratoBancario();
        conta1.retirarSaldo(600,"CapJul20");
        conta1.extratoBancario();
    }
}
