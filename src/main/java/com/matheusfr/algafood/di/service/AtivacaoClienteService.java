package com.matheusfr.algafood.di.service;

import com.matheusfr.algafood.di.modelo.Cliente;
import com.matheusfr.algafood.di.notificacao.NivelUrgencia;
import com.matheusfr.algafood.di.notificacao.Notificador;
import com.matheusfr.algafood.di.notificacao.TipoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Objects;

//@Component
public class AtivacaoClienteService {

    @TipoNotificador(NivelUrgencia.URGENTE)
    @Autowired//(required = false)
    private Notificador notificador;

    // CHAMADO DEPOIS DO CONSTRUTOR //
//    @PostConstruct
    public void init() {
        System.out.println("INIT");
    }

//    @PreDestroy // Antes de destruir o bean, chame esse método
    public void destroy() {
        System.out.println("DESTROY");
    }

    public void ativar(Cliente cliente) {
        cliente.ativar();

        if(Objects.isNull(notificador)) {
            System.out.println("Não existe notificador, mas cliente foi ativado!");
            return;
        }

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

}
