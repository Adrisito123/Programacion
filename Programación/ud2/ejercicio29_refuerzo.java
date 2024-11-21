package programacion.ud2;

import java.util.Scanner;

public class ejercicio29_refuerzo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int alturaMaxima = -1; 
        int etiquetaMaxima = -1; 

            for (int i = 0; true; i++) {
            
            System.out.print("Introduce la altura del árbol " + i + " (en cm) o -1 para terminar: ");
            int altura = scanner.nextInt();
            
            if (altura == -1) {
                break;
            }
            
            if (altura > alturaMaxima) {
                alturaMaxima = altura;
                etiquetaMaxima = i;
            }
        }

        if (etiquetaMaxima != -1) {
            System.out.println("El árbol más alto es el árbol con etiqueta " + etiquetaMaxima + " con una altura de " + alturaMaxima + " cm.");
        } else {
            System.out.println("No se introdujeron alturas válidas.");
        }
    }
}
