// Classe abstrata
// Não pode ser instânciada
// As classes filhas precisam ter as funções da classe abstrata
public abstract class Funcionario {
    // Modificadores de acesso (protected)
    protected String nome;
    protected String cpf;
    protected double salarioBase;

    // Método construtor da classe
    public Funcionario(String nome, String cpf, double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    // Método abstrato
    public abstract double calcularSalario();

    // Método abstrato
    public abstract double calcularBonus();

    // Método concreto (com implementação)
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Salário Total: R$ " + calcularSalario());
        System.out.println("Bônus: R$ " + calcularBonus());
    }

    // Método concreto
    public String getNome(){
        return nome;
    }
}
