package com.matheusfr.algafood.di.service;

import com.matheusfr.algafood.di.modelo.Cliente;
import com.matheusfr.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private List<Notificador> notificadores;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        for (Notificador notificador : notificadores) {
            if(Objects.isNull(notificador)) {
                System.out.println("Não existe notificador, mas cliente foi ativado!");
                continue;
            }

            notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }
    }

}
