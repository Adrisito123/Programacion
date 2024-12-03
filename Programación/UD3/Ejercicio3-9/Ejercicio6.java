
package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double num [] = new double[5];
        
        for (int i = 0; i < num.length; i++) {
            System.out.println("Dime num: ");
             num[i] = sc.nextDouble();
        }
        System.out.println("Los numeros que has puesto son: " );
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
    
}
