
package programacion.ud2;

import java.util.Scanner;


public class ejercicio16 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Par");
        } else 
            System.out.println("Impar");
}
     }
    