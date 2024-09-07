package br.com.thdmaster.cadastro_cliente.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public String obterCliente(){
        return "cliente 1";
    }
}
