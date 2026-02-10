public class Triangulo extends Forma{
    private double altura;
    private double base;

    public Triangulo(
            String cor,
            double altura,
            double base
    ){super(cor); this.altura = altura; this.base = base;}

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public void desenharForma(){System.out.println("Desenhando um TRIÂNGULO");}

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }
}
