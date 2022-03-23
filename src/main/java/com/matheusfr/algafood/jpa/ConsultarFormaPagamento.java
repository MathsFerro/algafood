package com.matheusfr.algafood.jpa;

import com.matheusfr.algafood.AlgafoodApplication;
import com.matheusfr.algafood.domain.model.FormaPagamento;
import com.matheusfr.algafood.domain.model.Restaurante;
import com.matheusfr.algafood.domain.repository.FormaPagamentoRepository;
import com.matheusfr.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ConsultarFormaPagamento {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);

        for(FormaPagamento formaPagamento : formaPagamentoRepository.listar()) {
            System.out.println(formaPagamento.getDescricao());
        }
    }

}
