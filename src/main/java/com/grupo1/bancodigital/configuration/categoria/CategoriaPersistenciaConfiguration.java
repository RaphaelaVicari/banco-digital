package com.grupo1.bancodigital.configuration.categoria;

import com.grupo1.bancodigital.entity.cliente.CategoriaEntity;
import com.grupo1.bancodigital.repository.CategoriaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoriaPersistenciaConfiguration {

    @Autowired
    private CategoriaRepository repository;

    @PostConstruct
    public void iniciarCategoriaTabela() {
        CategoriaEntity e = CategoriaEntity.builder()
                .nomeCategoria("Super")
                .build();

        CategoriaEntity e2 = CategoriaEntity.builder()
                .nomeCategoria("Comum")
                .build();

        CategoriaEntity e3 = CategoriaEntity.builder()
                .nomeCategoria("Premium")
                .build();

        repository.save(e);
        repository.save(e2);
        repository.save(e3);
    }

}
