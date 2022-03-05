package com.matheusfr.algafood.di.notificacao;

import com.matheusfr.algafood.di.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);

}
