
package programacion.ud2;

import java.util.Scanner;

public class ejercicio17 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un num: ");
        int num = sc.nextInt();
        System.out.println("Dime otro num: ");
        int num2 = sc.nextInt();
        
        if (num == num2) {
            System.out.println("Estos números son iguales");
        } else
            if (num2 > num) {
                System.out.println("El " + num2 + " es mayor que el " + num);
            } else
                if (num > num2) {
                System.out.println("El " + num + " es mayor que el "  + num2);
  
        }
}
}