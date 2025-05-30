package com.alura.ConversorDeMonedas2;

import java.util.Scanner;

public class ConversorInteractivo {

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        ApiCliente cliente = new ApiCliente();
        ConversorDeMoneda conversor = new ConversorDeMoneda();

        System.out.println("🟢 Bienvenido/a al Conversor de Moneda 🟢");

        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1 - USD a ARS (Peso argentino)");
            System.out.println("2 - USD a BOB (Boliviano)");
            System.out.println("3 - USD a BRL (Real brasileño)");
            System.out.println("4 - USD a CLP (Peso chileno)");
            System.out.println("5 - USD a COP (Peso colombiano)");
            System.out.println("6 - Ingresar otra moneda");
            System.out.println("7 - Salir");

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            String monedaDestino = "";
            switch (opcion) {
                case 1 -> monedaDestino = "ARS";
                case 2 -> monedaDestino = "BOB";
                case 3 -> monedaDestino = "BRL";
                case 4 -> monedaDestino = "CLP";
                case 5 -> monedaDestino = "COP";
                case 6 -> {
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Escribe el código de la moneda destino (ej. EUR, MXN, JPY): ");
                    monedaDestino = scanner.nextLine().toUpperCase();
                }
                case 7 -> {
                    System.out.println("👋 Gracias por usar el conversor. ¡Hasta luego!");
                    break;
                }
                default -> {
                    System.out.println("❌ Opción inválida. Intenta de nuevo.");
                    continue;
                }
            }

            if (opcion >= 1 && opcion <= 6) {
                System.out.print("Ingresa la cantidad en USD: ");
                double cantidad = scanner.nextDouble();

                String json = cliente.enviarSolicitud("USD");
                double resultado = conversor.convertir(json, monedaDestino, cantidad);

                System.out.println("-----------------------------------");
                System.out.printf("%.2f USD = %.2f %s%n", cantidad, resultado, monedaDestino);
                System.out.println("-----------------------------------");
            }
        }

        scanner.close();
    }
}
