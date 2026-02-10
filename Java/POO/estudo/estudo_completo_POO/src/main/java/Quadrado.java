public class Quadrado extends Forma{
    private double tamanhoLado;

    public Quadrado(
            String cor,
            double tamanhoLado
    ){super(cor); this.tamanhoLado = tamanhoLado;}

    @Override
    public double calcularArea(){return Math.pow(tamanhoLado, 2);}

    @Override
    public void desenharForma(){System.out.println("Desenhando um QUADRADO");}

    @Override
    public void exibirInfo() {
        super.exibirInfo();
    }

}
