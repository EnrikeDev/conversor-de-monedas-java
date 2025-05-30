package com.alura.ConversorDeMonedas2;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConversorDeMoneda {

    public double convertir(String json, String monedaDestino, double cantidad) {
        JsonElement elemento = JsonParser.parseString(json);
        JsonObject objeto = elemento.getAsJsonObject();

        JsonObject tasas = objeto.getAsJsonObject("conversion_rates");
        double tasa = tasas.get(monedaDestino).getAsDouble();

        return cantidad * tasa;
    }

    public double obtenerSoloTasa(String json, String monedaDestino) {
        JsonElement elemento = JsonParser.parseString(json);
        JsonObject objeto = elemento.getAsJsonObject();
        JsonObject tasas = objeto.getAsJsonObject("conversion_rates");
        return tasas.get(monedaDestino).getAsDouble();
    }
}
