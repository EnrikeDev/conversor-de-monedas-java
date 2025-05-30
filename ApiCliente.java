package com.alura.ConversorDeMonedas2;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiCliente {

        public String enviarSolicitud(String monedaBase) {
        String url = "https://v6.exchangerate-api.com/v6/10cb511f096e1d22ee3ad6a0/latest/" + monedaBase;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        try {
            HttpResponse<String> respuesta = cliente.send(solicitud, HttpResponse.BodyHandlers.ofString());
            return respuesta.body();
        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrió un error al enviar la solicitud: " + e.getMessage());
            return null;
        }
    }
}
