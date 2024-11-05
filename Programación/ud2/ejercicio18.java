
package programacion.ud2;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        double num;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero:");
        
        num = sc.nextDouble();
        
        if (num > -0.99 && num < 0.99 && num != 0) {
            System.out.println("Es un numero casi cero");
        } else {
            System.out.println("No es un numero casi cero");
        }
    }
}
