package com.matheusfr.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // Retention: diz quanto tempo que a anotação TipoNotificador deve permanecer onde foi utilizada,
// com RUNTIME vai ser em tempo de execução
@Qualifier
public @interface TipoNotificador {

    NivelUrgencia value();

}

// Anotation java https://beginnersbook.com/2014/09/java-annotations/