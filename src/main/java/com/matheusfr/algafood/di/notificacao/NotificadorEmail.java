package com.matheusfr.algafood.di.notificacao;

import com.matheusfr.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@TipoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    @Autowired
    private NotificadorProperties notificadorProperties;

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.println(notificadorProperties.getHostServidor());
        System.out.println(notificadorProperties.getPortaServidor());

        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}

