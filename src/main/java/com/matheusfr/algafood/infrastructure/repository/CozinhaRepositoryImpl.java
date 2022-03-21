package com.matheusfr.algafood.infrastructure.repository;

import com.matheusfr.algafood.domain.model.Cozinha;
import com.matheusfr.algafood.domain.repository.CozinhaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CozinhaRepositoryImpl implements CozinhaRepository {

    @Override
    public List<Cozinha> listar() {
        return null;
    }

    @Override
    public Cozinha buscar(Long id) {
        return null;
    }

    @Override
    public Cozinha salvar(Cozinha cozinha) {
        return null;
    }

    @Override
    public void remover(Cozinha cozinha) {

    }
}
