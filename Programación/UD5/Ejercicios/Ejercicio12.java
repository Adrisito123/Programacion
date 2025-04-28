package Ejercicios;

import java.util.*;

public class Ejercicio12 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Elige el tipo de diccionario:");
            System.out.println("1 - HashMap");
            System.out.println("2 - LinkedHashMap");
            System.out.println("3 - TreeMap");
            int opcion = scanner.nextInt();

            Map<String, String> diccionario;

            if (opcion == 1) {
                diccionario = new HashMap<>();
            } else if (opcion == 2) {
                diccionario = new LinkedHashMap<>();
            } else if (opcion == 3) {
                diccionario = new TreeMap<>();
            } else {
                System.out.println("Opción no válida.");
                return;
            }

            diccionario.put("ent", "Número entero");
            diccionario.put("dec", "Número decimal");
            diccionario.put("cad", "Cadena");
            diccionario.put("log", "Lógico");
            diccionario.put("bucle", "Estructura repetición");

            diccionario.put("ent", "Nuevo valor para entero");

            if (!diccionario.containsKey("cad")) {
                diccionario.put("cad", "Nuevo valor para Cadena");
            } else {
                System.out.println("La clave 'cad' ya existe.");
            }

            diccionario.remove("bucle");

            System.out.println("Valor de 'log': " + diccionario.get("log"));

            diccionario.put("log", "Booleano");

            System.out.println("Diccionario final:");
            for(Map.Entry<String, String> entry : diccionario.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
