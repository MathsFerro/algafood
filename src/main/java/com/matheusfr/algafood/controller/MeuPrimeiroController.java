package com.matheusfr.algafood.controller;

import com.matheusfr.algafood.di.modelo.Cliente;
import com.matheusfr.algafood.di.service.AtivacaoClienteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MeuPrimeiroController {

  private AtivacaoClienteService ativacaoClienteService;

  public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
    this.ativacaoClienteService = ativacaoClienteService;

    System.out.println("Meu primeiro controller");
  }

  @GetMapping
  public String hello() {
    Cliente joao = new Cliente("João", "joao@xyz.com", "12345");

    ativacaoClienteService.ativar(joao);

    return "Hello";
  }

}
