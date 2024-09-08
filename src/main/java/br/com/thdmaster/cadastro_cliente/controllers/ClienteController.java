package br.com.thdmaster.cadastro_cliente.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClienteController {


    @GetMapping("/clientes")
    public String obterCliente(){
        double randomNumber = 10.0 * Math.random();
        return "retornando cliente " + randomNumber;
    }

}
