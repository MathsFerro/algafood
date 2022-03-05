package com.matheusfr.algafood.di.notificacao;

import com.matheusfr.algafood.di.modelo.Cliente;


public class NotificadorEmail implements Notificador {

    private String hostServidorSmtp;
    private boolean caixaAlta;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("Notificador E-mail " + this);
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if(caixaAlta)
            mensagem = mensagem.toUpperCase();

        System.out.printf("Notificando %s através do e-mail %s usando SMTP: %s: %s\n",
                cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
    }

    public void setCaixaAlta(boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}

