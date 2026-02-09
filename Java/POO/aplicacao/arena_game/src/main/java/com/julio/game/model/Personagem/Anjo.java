package com.julio.game.model.Personagem;

import com.julio.game.interfaces.Atacante.Curador;
import com.julio.game.interfaces.Atacante.Voador;

public class Anjo extends Personagem implements Curador, Voador {

    public Anjo(String nome){super(nome);}

    @Override
    public void recuperarVida() {
        System.out.println("O anjo " + nome + " está curando!");
    }

    @Override
    public void decolar() {
        System.out.println("O anjo está voando!");
    }
}
