package com.julio.game.model.Personagem;
import com.julio.game.interfaces.Atacante.Atacante;

// Clase pública (Guerreiro) que herda as funções e variáveis da classe abstrata (Personagem)
// Implementação da interface (Atacante) que tem funções específicas
public class Guerreiro extends Personagem implements com.julio.game.interfaces.Atacante.Atacante {

    public Guerreiro(String nome){super(nome);}

    @Override
    public void causarDano() {
        System.out.println(nome + " deu uma espadada!");
    }
}
