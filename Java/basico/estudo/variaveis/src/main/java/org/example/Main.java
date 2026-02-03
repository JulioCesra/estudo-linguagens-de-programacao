package org.example;

class variaveis{
    static void main(String[] args){
        // Tipos de variáveis
        int idade = 18; // Tipo inteiro
        double altura = 1.87; // Ponto flutuante
        boolean sexo_homem = true; // Verdadeiro ou falso
        String nome = "Júlio César"; // String
        char primeira_letra_nome = nome.charAt(0);
        String formato_mensagem_output = String.format("""
                Nome: %s \n
                Idade: %d \n
                Altura: %.2f \n
                É homem? - %b \n
                Primeira letra do nome: %c \n
                """,nome, idade, altura, sexo_homem, primeira_letra_nome);
        System.out.println(formato_mensagem_output);
    }
}
