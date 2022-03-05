package com.matheusfr.algafood.di.notificacao;

import com.matheusfr.algafood.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class NotificadorEmail implements Notificador {

    public NotificadorEmail() {
        System.out.println("Notificador E-mail " + this);
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }

}

