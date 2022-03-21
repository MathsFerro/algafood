package com.matheusfr.algafood.jpa;

import com.matheusfr.algafood.AlgafoodApplication;
import com.matheusfr.algafood.domain.model.Restaurante;
import com.matheusfr.algafood.domain.repository.RestauranteRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

public class ConsultarRestaurante {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(AlgafoodApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        RestauranteRepository restauranteRepository = applicationContext.getBean(RestauranteRepository.class);

        for(Restaurante restaurante : restauranteRepository.listar()) {
            System.out.println(restaurante.getNome());
        }
    }

}
