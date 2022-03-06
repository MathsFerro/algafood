package com.matheusfr.algafood.listener;

import com.matheusfr.algafood.di.service.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmissaoNotaFiscalService {

    @EventListener
    public void emitirNotaFiscal(ClienteAtivadoEvent event) {
        System.out.println("Emitindo nota fiscal para o cliente " + event.getCliente().getNome());
    }

}
