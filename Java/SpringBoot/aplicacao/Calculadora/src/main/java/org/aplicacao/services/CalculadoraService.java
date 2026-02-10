package org.aplicacao.services;

import org.springframework.stereotype.Service;

// Classe Service responsável por armazenar as operações matemáticas que serão utilizadas
@Service
public class CalculadoraService {
    public double somar(double n1, double n2){return n1 + n2;}
    public double subtrair(double n1, double n2){return n1 - n2;}
    public double dividir(double n1, double n2) throws ArithmeticException{return n1 / n2;}
    public double multiplicar(double n1, double n2){return n1 * n2;}
}
