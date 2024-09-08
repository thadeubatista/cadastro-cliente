package br.com.thdmaster.cadastro_cliente.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClienteController {

    private static final String METADATA_URL = "http://169.254.170.2" + System.getenv("ECS_CONTAINER_METADATA_URI_V4") + "/task";

    @GetMapping("/clientes")
    public String obterCliente(){
        String azInfo = getAvailabilityZone();

        return "cliente 1 " + azInfo;
    }

    private String getAvailabilityZone() {
        try {
            RestTemplate restTemplate = new RestTemplate();
            String metadata = restTemplate.getForObject(METADATA_URL, String.class);
            // Parse the JSON response to extract the AvailabilityZone (AZ)
            // Assuming the metadata includes an "AvailabilityZone" field.
            // You will need to map the response accordingly.

            // Example: Assuming the metadata has a field "AvailabilityZone"
            String az = "us-east-1a"; // Extracted value, placeholder for actual parsing logic

            return az;
        } catch (Exception e) {
            return "Unknown AZ";
        }
    }
}
