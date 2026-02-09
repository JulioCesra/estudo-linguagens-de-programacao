package com.julio.game.model.Personagem;

import com.julio.game.interfaces.Atacante.Atacante;
import com.julio.game.interfaces.Atacante.Voador;

public class Dragao extends Personagem implements Atacante, Voador {

    public Dragao(String nome){super(nome);}

    @Override
    public void causarDano() {
        System.out.println("O dragão " + nome + " está jogando bolas de fogos!");
    }

    @Override
    public void decolar() {
        System.out.println("O dragão está voando!");
    }
}
