package com.grupo1.bancodigital.entity.cliente;


import com.grupo1.bancodigital.entity.conta.ContaEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
@Builder(toBuilder = true)
public class ClienteEntity implements Serializable {

    @Id
    @Column(name = "cpf")
    private String cpf;

    @Column(name = "nome_cliente")
    private String nomeCliente;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @ManyToOne
    @JoinColumn(name = "fk_categoria", referencedColumnName = "id_categoria")
    private CategoriaEntity categoria;

    @OneToOne(mappedBy = "cliente")
    private EnderecoEntity endereco;

    @OneToOne(mappedBy = "cliente")
    private ContaEntity conta;

}
