package com.matheusfr.algafood.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email") // Vai dizer que essa classe representa um arquivo de configuração de propiedades
public class NotificadorProperties {

    // notificador.email -> vai pegar todas as propriedades que começam desta forma
    // .host-servidor vai ser atribuido em hostServidor
    // .porta-servidor vai ser atribuido em portaServidor

    private String hostServidor;
    private Integer portaServidor;

    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }

    public Integer getPortaServidor() {
        return portaServidor;
    }

    public void setPortaServidor(Integer portaServidor) {
        this.portaServidor = portaServidor;
    }
}
