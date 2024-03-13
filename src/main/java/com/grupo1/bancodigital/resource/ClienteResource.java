package com.grupo1.bancodigital.resource;

import com.grupo1.bancodigital.dto.ClienteRequest;
import com.grupo1.bancodigital.dto.ClienteResponse;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClienteResource {

    @PostMapping("/api/cliente")
    @ResponseBody
    public ClienteResponse postCliente(@RequestBody ClienteRequest cliente) {
        ClienteRequest cliente2 = cliente.toBuilder()
                .nome("abc")
                .build();
        return ClienteResponse.builder()
                .message("OK")
                .statusCode(200)
                .build();
    }

    @GetMapping("/api/cliente/{idCliente}")
    public ClienteResponse getCliente(@PathParam("idCliente") Long idCliente) {
        return ClienteResponse.builder()
                .message("OK")
                .statusCode(200)
                .build();
    }

}
