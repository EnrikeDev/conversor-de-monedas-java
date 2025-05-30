package com.alura.ConversorDeMonedas2;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.Arrays;
import java.util.List;

public class FiltroDeMonedas {

    public void mostrarTasasFiltradas(String json) {
        // Lista de monedas que queremos mostrar
        List<String> monedasSeleccionadas = Arrays.asList("ARS", "BOB", "BRL", "CLP", "COP");

        // Parsear el JSON
        JsonElement elemento = JsonParser.parseString(json);
        JsonObject objeto = elemento.getAsJsonObject();
        JsonObject tasas = objeto.getAsJsonObject("conversion_rates");

        System.out.println("Tasas filtradas (respecto a USD):");
        for (String codigo : monedasSeleccionadas) {
            if (tasas.has(codigo)) {
                double valor = tasas.get(codigo).getAsDouble();
                System.out.println(codigo + " = " + valor);
            } else {
                System.out.println("No se encontró la moneda: " + codigo);
            }
        }
    }
}
