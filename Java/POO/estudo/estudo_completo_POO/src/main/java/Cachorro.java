// Estudo polimorfismo
// A classe CACHORRO (FILHO) herda as função e variáveis da classe Animal (PAI)
public class Cachorro extends Animal{
    // Nova atribuição ao animal
    private final String raca;

    // Construtor da classe Cachorro
    // Uso do super para chamada do construtor da classe Animal
    public Cachorro(
            String nome,
            String genero,
            String coloracao,
            String raca
    ){super(nome, genero, coloracao); this.raca = raca;}

    // Utilização de Override para sobrescrever função
    @Override
    public void emitirSom(){System.out.println(nome + " está latindo");}

    // Função própria da classe Cachorro
    public void abanarRabo(){System.out.println(nome + " está abanando o rabo");}

    // Chamada da função original (através do super) e adição de nova visualização de variável
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Raça do animal: " + raca);
    }

    static void main(String[] args){
        // Criação do objeto da classe Cachorro
        Cachorro cachorro1 = new Cachorro(
                "Bruce",
                "macho",
                "preto",
                "yorkshine"
        );
        // Utilização das funções da classe Animal (PAI) e Cachorro (FILHO)
        cachorro1.dormir();
        cachorro1.emitirSom();
        cachorro1.abanarRabo();
        cachorro1.exibirInfo();
    }
}
