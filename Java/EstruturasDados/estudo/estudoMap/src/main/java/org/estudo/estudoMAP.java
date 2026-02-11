package org.estudo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class estudoMAP {
    private Map<String, Integer> pessoas = new HashMap<>();

    public void adicionarPessoas(String nome, int idade){
        this.pessoas.put(nome, idade);
    }

    public Integer buscarIdade(String nome){
        if(!this.pessoas.containsKey(nome)){
            System.err.println("Pessoa não encontrada");
            return 0;
        }
        return this.pessoas.get(nome);
    }

    public List<Integer> idadesSuperior20(){
        return this.pessoas.values()
                .stream()
                .filter(idade -> idade > 20)
                .toList();
    }

    public List<String> nomeComecaA(){
        return this.pessoas.keySet()
                .stream()
                .filter(s -> s.startsWith("A"))
                .toList();
    }

    public void listarPessoas(){
        if (this.pessoas.isEmpty()){
            System.err.println("HashMap vazio!");
            return;
        }
        pessoas.forEach((nome, idade) -> System.out.printf("%s : %d\n",nome,idade));
    }

    static void main(){
        estudoMAP estudo = new estudoMAP();
        estudo.adicionarPessoas("Júlio",19);
        estudo.adicionarPessoas("Carlos",20);
        estudo.adicionarPessoas("Rogerio",54);
        estudo.listarPessoas();
        System.out.println(estudo.buscarIdade("j"));
        System.out.println(estudo.idadesSuperior20());
    }
}
