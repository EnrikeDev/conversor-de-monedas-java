# Conversor de Monedas en Java

Este proyecto es un conversor de monedas desarrollado en Java como parte del desafío final del programa **Oracle Next Education (ONE)**. Utiliza una API externa para obtener las tasas de cambio actualizadas y permite al usuario interactuar a través de un menú en la consola para realizar conversiones entre distintas monedas.

---

## Descripción del Desafío

El objetivo fue aplicar conocimientos de:
- Programación en Java
- Manipulación de JSON con Gson
- Uso de API REST con HttpClient y HttpRequest
- Interacción con el usuario en consola (Scanner)
- Estructuración de un proyecto en múltiples clases

---

## Tecnologías utilizadas

- Java 17+
- IntelliJ IDEA
- Gson (Google JSON library)
- ExchangeRate-API
- Java Standard Library (HttpClient, Scanner)

---

## Funcionalidades

✅ Consulta de tasas de cambio en tiempo real  
✅ Conversión entre monedas con precisión decimal  
✅ Interfaz de consola amigable  
✅ Menú interactivo con opciones fijas y personalizadas  
✅ Cierre seguro de la aplicación

---

## Estructura del proyecto

```bash
src/com/alura/ConversorDeMonedas2/
│
├── ApiCliente.java              # Realiza la solicitud HTTP a la API
├── ConversorMoneda.java         # Lógica de conversión con Gson
├── FiltroDeMonedas.java         # Filtra y muestra tasas seleccionadas
├── Bienvenida.java              # Menú textual con diseño amigable
├── ConversorInteractivo.java    # Controla la interacción con el usuario
├── Main.java                    # Punto de inicio del programa
