package com.alura.ConversorDeMonedas2;

import java.util.Scanner;

public class ConversorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApiCliente cliente = new ApiCliente();
        ConversorDeMoneda conversor = new ConversorDeMoneda();

        System.out.println("👋 Bienvenido al Conversor de Monedas");
        System.out.print("Ingresa la moneda base (ej: USD): ");
        String monedaBase = scanner.nextLine().toUpperCase();

        System.out.print("Ingresa la moneda destino (ej: COP): ");
        String monedaDestino = scanner.nextLine().toUpperCase();

        System.out.print("¿Cuánto deseas convertir?: ");
        double cantidad = scanner.nextDouble();

        String json = cliente.enviarSolicitud(monedaBase);

        double resultado = conversor.convertir(json, monedaDestino, cantidad);

        System.out.println("----------------------------------");
        System.out.println(cantidad + " " + monedaBase + " = " + resultado + " " + monedaDestino);
        System.out.println("----------------------------------");

        scanner.close();
    }
}
