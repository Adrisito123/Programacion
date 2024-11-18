
package programacion.ud2;

import java.util.Scanner;

public class ejercico52 {
    public static void main (String[]args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero:");
        int num = sc.nextInt();
        
        if(esPrimo(num)){
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
    public static boolean esPrimo(int num){
        boolean primo = true;
        int i = 2;
            
        if (num < 2){
            primo = false;
        }
        while (i < num && primo){
            if (num % i == 0){
                primo = false;
            }
            i++;
        }
        return primo;
    }
}
