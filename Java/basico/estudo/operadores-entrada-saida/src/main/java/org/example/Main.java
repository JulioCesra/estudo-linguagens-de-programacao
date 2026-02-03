package org.example;

import java.util.Scanner;

class codificacao{
    public static void main(String[] args){
        Scanner leitura_teclado = new Scanner(System.in);
        System.out.println("Quem vai realizar as operações matemáticas?");
        String usuario_calculadora = leitura_teclado.next();
        System.out.println("Digite o primeiro valor: ");
        double valor1 = leitura_teclado.nextDouble();
        System.out.println("Digite o segundo valor: ");
        double valor2 = leitura_teclado.nextDouble();
        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;
        String resultado_operacoes = String.format("""
                Usuário logado: %s
                Valores recebidos: %.2f | %.2f
                Resultado do somatório: %.2f
                Resultado da subtração: %.2f
                Resultado da multiplicação: %.2f
                Resultado da divisão: %.2f
                """,usuario_calculadora, valor1, valor2, soma, subtracao, multiplicacao, divisao);
        System.out.println(resultado_operacoes);
    }
}
