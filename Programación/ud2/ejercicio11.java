package programacion.ud2;

import java.util.Scanner;

public class ejercicio11 {
    public static void main (String[]args){
        int num1;
        int num2;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el primer numero:");
        num1 = sc.nextInt();
        
        System.out.println("Dime otro numero:");
        num2 =  sc.nextInt();
        
        int mayormenor = num1 > num2 ? num1: num2 ;
        
        System.out.println("El numero mayor es: " + mayormenor);
    }    
}
