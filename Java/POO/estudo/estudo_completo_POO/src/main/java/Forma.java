// Estudo de sobrescrita
public class Forma {
    protected String cor;

    public Forma(String cor){this.cor = cor;}

    public double calcularArea(){return 0.0;}

    public void desenharForma(){System.out.println("Desenhando a forma ...");}

    public void exibirInfo(){
        System.out.println("Cor: " + cor);
        System.out.println("Área: " + calcularArea());
    }
}
