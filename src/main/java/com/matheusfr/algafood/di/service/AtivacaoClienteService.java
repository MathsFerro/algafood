package com.matheusfr.algafood.di.service;

import com.matheusfr.algafood.di.modelo.Cliente;
import com.matheusfr.algafood.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AtivacaoClienteService {

    @Qualifier("sms")
    @Autowired//(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.ativar();

        if(Objects.isNull(notificador)) {
            System.out.println("Não existe notificador, mas cliente foi ativado!");
            return;
        }

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
