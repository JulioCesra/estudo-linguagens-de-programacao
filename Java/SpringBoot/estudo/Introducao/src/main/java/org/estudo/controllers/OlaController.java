package org.estudo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Classe que aceita requisições HTTP
@RestController
public class OlaController {
    // Rota da requisição GET. Quando acessado, é executado a função abaixo
    @GetMapping("/ola")
    // Parâmetro que pode ser passado na requisição GET
    // Caso não seja inserido nada, tem como valor default Dev
    public String saudacao(@RequestParam(defaultValue = "Dev") String nome){
      return  "Olá " + nome;
    }
}
