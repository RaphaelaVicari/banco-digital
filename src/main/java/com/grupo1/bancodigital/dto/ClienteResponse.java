package com.grupo1.bancodigital.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class ClienteResponse {

    private String message;
    private Integer statusCode;

}
