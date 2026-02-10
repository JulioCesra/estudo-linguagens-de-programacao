package com.empresa.modelo;
// Classe Gerente que herda as funções da classe Funcionario
public class Gerente extends Funcionario{
    private double bonusFixo;

    public Gerente(String nome, String cpf, double salarioBase, double bonusFixo){
        super(nome,cpf,salarioBase);
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonusFixo;
    }

    @Override
    public double calcularBonus() {
        return bonusFixo;
    }
}
