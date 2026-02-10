// Estudo de herança
public class Animal {
    // Modificadores de acesso (protected)
    // É possível acessar essas variáveis nas classes filhas
    protected String nome;
    protected String genero;
    protected String coloracao;

    // Construtor da classe
    public Animal(
            String nome,
            String genero,
            String coloracao
    ){this.nome = nome; this.genero = genero; this.coloracao = coloracao;}

    // Função sem retorno da classe Animal (PAI)
    public void emitirSom(){
        System.out.println("Animal fazendo som...");
    }

    // Função sem retorno da classe Animal (PAI)

    public void dormir(){
        System.out.println("Dormindo...");
    }

    // Função sem retorno da classe Animal (PAI)
    public void exibirInfo(){
        String output = String.format("""
                Nome do animal: %s
                Gênero do animal: %s
                Coloração do animal: %s
                """, nome, genero, coloracao);
        System.out.println(output);
    }
}
