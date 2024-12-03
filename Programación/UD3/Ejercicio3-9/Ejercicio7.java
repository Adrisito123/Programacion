package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime cuántos números quieres introducir:");
        int n = sc.nextInt();
        
        int num[] = new int[n];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Dime un número:");
            num[i] = sc.nextInt();
        }
        
        System.out.println("Los números en orden inverso son:");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
