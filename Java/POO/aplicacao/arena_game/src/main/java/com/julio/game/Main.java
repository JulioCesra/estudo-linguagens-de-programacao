package com.julio.game;

// Importação dos pacotes (model e interfaces)
import com.julio.game.interfaces.Atacante.Voador;
import com.julio.game.model.Personagem.Anjo;
import com.julio.game.model.Personagem.Dragao;
import com.julio.game.model.Personagem.Guerreiro;
import com.julio.game.model.Personagem.Personagem;

import java.util.ArrayList;

public class Main {
    public void main(String[] args){
        ArrayList<Personagem> game = new ArrayList<>();
        game.add(new Guerreiro("Júlio"));
        game.add(new Anjo("Roger"));
        game.add(new Dragao("Cortnex"));
        // Laço de repetição que percorre a ArrayList
        for (Personagem p : game){
            // Se o objeto implementa a interface Voador
            if(p instanceof Voador){
                ((Voador) p).decolar(); // Chamada da função decolar
            }else{
                // Caso ele não implemente a interface (Voador)
                // Mensagem genérica
                System.out.println("X");
            }
        }
    }
}
