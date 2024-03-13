package com.grupo1.bancodigital.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ClienteRequest {

    private String cpf;
    private String nome;

}
