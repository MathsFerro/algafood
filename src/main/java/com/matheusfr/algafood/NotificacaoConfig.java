package com.matheusfr.algafood;

import com.matheusfr.algafood.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {

    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificador = new NotificadorEmail("smtp.algaemail.com.br");
        notificador.setCaixaAlta(true);

        return notificador;
    }

}
