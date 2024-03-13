package com.grupo1.bancodigital.configuration.tipoconta;

import com.grupo1.bancodigital.entity.conta.TipoContaEntity;
import com.grupo1.bancodigital.repository.TipoContaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TipoContaPersistenciaConfiguration {

    @Autowired
    private TipoContaRepository tipoContaRepository;

    @PostConstruct
    public void iniciarTipoContaTabela() {
        TipoContaEntity contaCorrente = TipoContaEntity.builder()
                .nomeTipoConta("CORRENTE")
                .build();
        TipoContaEntity contaPoupanca = TipoContaEntity.builder()
                .nomeTipoConta("POUPANÇA")
                .build();

        tipoContaRepository.save(contaCorrente);
        tipoContaRepository.save(contaPoupanca);
    }

}
