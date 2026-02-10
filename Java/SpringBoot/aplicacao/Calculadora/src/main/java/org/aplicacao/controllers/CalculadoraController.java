package org.aplicacao.controllers;

import org.aplicacao.services.CalculadoraService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController // Classe que permite requisições HTTP
@RequestMapping("/calculadora") // Endpoint da classe
public class CalculadoraController {
    // Instância do objeto da CalculadoraService
    private final CalculadoraService service;
    public CalculadoraController(CalculadoraService service){
        this.service = service;
    }
    // Endpoint GET para realizar operações de soma
    // Permite a passagem de parâmetros dos valores
    @GetMapping("/soma")
    public String calcularSoma(@RequestParam double n1, @RequestParam double n2){
        double resultado = service.somar(n1, n2);
        return String.format("Resultado da soma dos valores (%.2f e %.2f) = %.2f",n1,n2,resultado);
    }
    // Endpoint GET para realizar operações de subtração
    // Permite a passagem de parâmetros dos valores
    @GetMapping("/subtracao")
    public String calcularSubtracao(@RequestParam double n1, @RequestParam double n2){
        double resultado = service.subtrair(n1, n2);
        return String.format("Resultado da subtração dos valores (%.2f e %.2f) = %.2f",n1,n2,resultado);
    }
    // Endpoint GET para realizar operações de divisão
    // Permite a passagem de parâmetros dos valores
    @GetMapping("/divisao")
    public String calcularDivisao(@RequestParam double n1, @RequestParam double n2){
        double resultado = service.dividir(n1, n2);
        return String.format("Resultado da divisão dos valores (%.2f e %.2f) = %.2f",n1,n2,resultado);
    }
    // Endpoint GET para realizar operações de multiplicação
    // Permite a passagem de parâmetros dos valores
    @GetMapping("/multiplicacao")
    public String calcularMultiplicacao(@RequestParam double n1, @RequestParam double n2){
        double resultado = service.multiplicar(n1, n2);
        return String.format("Resultado da multiplicação dos valores (%.2f e %.2f) = %.2f",n1,n2,resultado);
    }

}
