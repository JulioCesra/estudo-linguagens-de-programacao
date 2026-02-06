// Classe responsável por armazenar informações do usuário
public class Usuario {
    // Variáveis necessárias para definir um usuário
    private final String nome;
    private final int idade;
    private final double peso;
    private final double altura;

    // MÉTODO CONSTRUTOR DA CLASSE
    public Usuario(
            final String nome_usuario,
            final int idade_usuario,
            final double peso_usuario,
            final double altura_usuario
    ){
        // Atribuição das variáveis
        this.nome = nome_usuario;
        this.idade = idade_usuario;
        this.peso = peso_usuario;
        this.altura = altura_usuario;
    }

    // criação de getters para consulta de informações sobre o usuário
    public String getNome() {
        return nome;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }
}
