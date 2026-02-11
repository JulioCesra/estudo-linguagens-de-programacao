package org.estudo;

import org.estudo.services.Produto;

import java.util.*;

public class esteiraProdutos{
    private Map<Integer, Produto> produtos = new HashMap<>();
    private int ID;

    public void adicionarProdutos(Produto produto){
        this.produtos.put(incrementarID(), produto);
    }

    public Map<Integer, Produto> listarProdutos(){
        return this.produtos;
    }

    public List<String> listaNomesProdutos(){
        return this.produtos.values()
                .stream()
                .map(Produto::nome)
                .toList();
    }

    public Map<String, Double> valorTotalUnicoItem(int idProduto){
        return Optional.ofNullable(this.produtos.get(idProduto)) // Verificação de existência de item
                .map(produto -> {
                    Map<String, Double> resultado = new HashMap<>();
                    resultado.put(produto.nome(), produto.quantidade() * produto.preco());
                    return resultado;
                }) // Caso não encontre
                .orElse(Collections.emptyMap());
    }

    public record ResumoProduto(String nomeProduto, double valorTotal){}
    public List<ResumoProduto> listaValoresTotalItems(){
        return this.produtos.values() // Todos os valores
                .stream()// Percorre os valores
                .map(produto -> new ResumoProduto(produto.nome(), produto.quantidade() * produto.preco()))
                .toList();
    }

    private int incrementarID(){return this.ID += 1;}

    static void main(){
        esteiraProdutos linhaProducao = new esteiraProdutos();
        linhaProducao.adicionarProdutos(new Produto("Arroz",20,1.39));
        linhaProducao.adicionarProdutos(new Produto("Feijão",100,10.2));
        System.out.println(linhaProducao.listarProdutos());
        System.out.println(linhaProducao.listaNomesProdutos());
        System.out.println(linhaProducao.valorTotalUnicoItem(1));
        System.out.println(linhaProducao.listaValoresTotalItems());
    }
}
