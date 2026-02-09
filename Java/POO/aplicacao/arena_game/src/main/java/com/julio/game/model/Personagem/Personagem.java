package com.julio.game.model.Personagem;
public class Personagem {
    protected String nome;
    protected double vida;
    protected boolean isVivo;

    public Personagem(String nome){
        this.nome = nome;
        this.vida = 100;
        this.isVivo = true;
    }

}
