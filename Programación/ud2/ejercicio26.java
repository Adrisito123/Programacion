
package programacion.ud2;

import java.util.Scanner;

public class ejercicio26 {
   public static void main (String[] args){
       
       int num;
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Dime cuantas veces quieres ver el Eco:");
       num = sc.nextInt();
       
       for (int i = num;i > 0; i--) {
           System.out.println("Eco");
       }
   }
}