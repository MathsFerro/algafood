package com.matheusfr.algafood.di.service;

import com.matheusfr.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher; // Publique eventos dentro do container spring

    public void ativar(Cliente cliente) {
        cliente.ativar();

        // Dizer para o container que o cliente está ativo neste momento
        eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }

}
