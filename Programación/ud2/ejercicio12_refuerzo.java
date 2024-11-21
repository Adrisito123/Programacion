
package programacion.ud2;

import java.util.Scanner;

public class ejercicio12_refuerzo {
    public static void main(String[]args){
        int num;
        Scanner sc  = new Scanner(System.in);
        
        System.out.println("Dime un numero:");
        num = sc.nextInt();
        
        num %= 3;
        
        System.out.println("El resto es: " + num);
        
        
    }
    
}
