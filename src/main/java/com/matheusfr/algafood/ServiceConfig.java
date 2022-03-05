package com.matheusfr.algafood;

import com.matheusfr.algafood.di.notificacao.Notificador;
import com.matheusfr.algafood.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) { // Vai receber o notificador instanciado na NotificacaoConfig
        return new AtivacaoClienteService(notificador);
    }

}
