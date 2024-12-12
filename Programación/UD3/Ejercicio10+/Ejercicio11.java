package Ejercicios;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        int r[] = new int[5];
        
        busquedaAleatoriaArray(r);
        ordenarArray(r);
        
        System.out.print("Array aleatorio y ordenado: ");
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
        System.out.println();
        
        System.out.println("Dime otro numero: ");
        int num1 = sc.nextInt();
        
        int resultado = busqueda(num1, r);
        if (resultado != -1) {
            System.out.println("Búsqueda lineal: Número encontrado en la posición: " + resultado);
        } else {
            System.out.println("Búsqueda lineal: Número no encontrado");
        }
        
        resultado = java.util.Arrays.binarySearch(r, num1);
        if (resultado >= 0) {
            System.out.println("Búsqueda binaria: Número encontrado en la posición: " + resultado);
        } else {
            System.out.println("Búsqueda binaria: Número no encontrado");
        }
        
        sc.close(); 
    }

    public static int busqueda(int n, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                return i; 
            }
        }
        return -1; 
    }

    public static void busquedaAleatoriaArray(int[] r) {
        for (int i = 0; i < r.length; i++) {
            r[i] = (int) (Math.random() * 100) + 1;
        }
    }
    
    public static void ordenarArray(int[] r) {
        java.util.Arrays.sort(r);
    }
}
