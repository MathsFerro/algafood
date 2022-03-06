package com.matheusfr.algafood.listener;

import com.matheusfr.algafood.di.notificacao.NivelUrgencia;
import com.matheusfr.algafood.di.notificacao.Notificador;
import com.matheusfr.algafood.di.notificacao.TipoNotificador;
import com.matheusfr.algafood.di.service.ClienteAtivadoEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NotificacaoService {

    @TipoNotificador(NivelUrgencia.SEM_URGENCIA)
    @Autowired
    private Notificador notificador;

    @EventListener // Esse método é um ouvinte desse evento
    public void clienteAtivadoListener(ClienteAtivadoEvent event) {
        notificador.notificar(event.getCliente(), "Seu cadastro no sistema está ativo!");
    }

}
