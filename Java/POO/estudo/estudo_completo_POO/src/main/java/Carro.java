// Estudo de classes, objetos e construtores
// Modificador de acesso (public)
// A classe pode ser instânciada e criada um objeto em outros classes
public class Carro {
    // Modificadores de acesso (private) para restringir acesso direto as variáveis
    private String marca;
    private String modelo;
    private int ano_lancamento;

    // Método Construtor
    public Carro(String marca, String modelo, int ano_lancamento){
        this.marca = marca;
        this.modelo = modelo;
        this.ano_lancamento = ano_lancamento;
    }

    // Métodos (get) para leitura das variáveis privadas
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno_lancamento() {
        return ano_lancamento;
    }
}
