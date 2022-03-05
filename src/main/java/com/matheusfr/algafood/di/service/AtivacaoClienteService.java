package com.matheusfr.algafood.di.service;

import com.matheusfr.algafood.di.modelo.Cliente;
import com.matheusfr.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Qualifier("email")
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
        System.out.println("AtivacaoClienteService" + notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
