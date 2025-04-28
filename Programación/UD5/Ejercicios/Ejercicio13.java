package Ejercicios;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un texto: ");
        String texto = scanner.nextLine();

        String[] palabras = texto.toLowerCase().replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚñÑ ]", "").split("\\s+");

        Map<String, Integer> contador = new TreeMap<>();

        for (String palabra : palabras) {
            contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
        }

        System.out.println("Frecuencia de palabras:");
        for (Map.Entry<String, Integer> entry : contador.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
