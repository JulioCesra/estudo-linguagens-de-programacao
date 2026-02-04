public class Usuario {
    // Variáveis privadas, forma de impedir a alteração direta no código
    private String nome;
    private int idade;
    private double altura;
    private String endereco;

    // Método construtor da classe Usuario
    public Usuario(
            String nome_inserido,
            int idade_inserida,
            double altura_inserida,
            String endereco_inserido
    ){
        // Atribuição dos valores recebidos nas variáveis privadas
        this.nome = nome_inserido;
        this.idade = idade_inserida;
        this.altura = altura_inserida;
        this.endereco = endereco_inserido;
    }

    // Implementação de funções get para requisição de valores quando possível
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public String getEndereco() {
        return endereco;
    }
}
