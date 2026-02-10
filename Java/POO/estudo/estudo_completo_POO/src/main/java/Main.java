public class Main {
    public static void main(String[] args){
        Quadrado quadrado = new Quadrado("Vermelho",20);
        Triangulo triangulo = new Triangulo("Azul", 20, 12);

        quadrado.desenharForma();
        quadrado.exibirInfo();

        triangulo.desenharForma();
        triangulo.exibirInfo();
    }
}
